<template>
  <div class="maincontainer list-group" v-on:update="getListOnSearch($event)">
    <div class="playercontainer" v-if="$props.playerteam == 'player'">
      <router-link
        :to="{ name: 'athleteInfo', params: { id: athlete.id } }"
        class="list-group-item list-group-item-action list-group-item-secondary"
        v-for="athlete in athletes"
        :key="athlete.id"
        >{{ athlete.name }}</router-link
      >
    </div>
    <div class="teamcontainer" v-if="$props.playerteam == 'team'">
      <router-link
        :to="{ name: 'teaminfo', params: { id: team.id } }"
        class="list-group-item list-group-item-action list-group-item-secondary"
        v-for="team in teams"
        :key="team.id"
        >{{ team.name }}</router-link
      >
    </div>
  </div>
</template>

<script>
/* eslint-disable */
import SearchResultService from "../services/SearchResultService";

export default {
  name: "SearchResults",
  data() {
    return {
      teams: [],
      athletes: [],
    };
  },
  props: ["playerteam", "search"],
  watch: {
    deep: true,
    search() {
      getListOnSearch();
    },
  },
  methods: {
    async getAllAthletes() {
      try {
        var athleteData = await SearchResultService.getAthletes();
        athleteData = athleteData.data;
        this.athletes = athleteData;
      } catch (e) {
        console.log(e);
      }
    },
    async getAllTeams() {
      try {
        var teamData = await SearchResultService.getTeams();
        teamData = teamData.data;
        this.teams = teamData;
      } catch (e) {
        console.log(e);
      }
    },
    async getListOnSearch() {
      console.log("IS IT WORKING");
      if (this.$props.playerteam == "team") {
        try {
          var teamData = await SearchResultService.getTeamSearch(
            this.$props.search
          );
          teamData = teamData.data;
          this.teams = [];
          this.teams = teamData;
          console.log("CHANGED TEAMS");
          console.log(this.teams);
        } catch (e) {
          console.log(e);
        }
      } else {
        try {
          var athleteData = await SearchResultService.getAthleteSearch(
            this.$props.search
          );
          athleteData = athleteData.data;
          this.athletes = [];
          this.athletes = athleteData;
          console.log("CHANGED ATHLETES");
          console.log(this.athletes);
        } catch (e) {
          console.log(e);
        }
      }
    },
  },
  async created() {
    await this.getAllAthletes();
    await this.getAllTeams();
  },
  // async created() {
  //   await this.getListOnSearch();
  // },
};
</script>

<style scoped>
.maincontainer {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}
</style>
