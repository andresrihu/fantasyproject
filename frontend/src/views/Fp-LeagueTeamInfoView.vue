<template>
  <div>
    <h1>{{ leagueTeamName }}</h1>
    <router-link to="/draft">Ready For Draft?!</router-link>
    <br>
    <router-link to="/leagueSettings">League Settings</router-link>
    <div class="maincontainer">
      <h3>Team Manager: {{ leagueTeamOwner }}</h3>
      <div class="innercontainer">
        <h3>Players on team</h3>
        <AthletesTeamLeagueList />
      </div>
    </div>
  </div>
</template>

<script>
import AthletesTeamLeagueList from "../components/AthletesTeamLeagueList.vue";

export default {
  name: "LeagueTeamInfo",
  components: {
    AthletesTeamLeagueList: AthletesTeamLeagueList,
  },
  data() {
    return {
      leagueTeamName: "Donny's Dudes",
      leagueTeamOwner: "Carmen Shannon",
    };
  },
};
</script>

<style scoped>
h1 {
  color: black;
  margin-bottom: 25px;
}
h3 {
  margin-bottom: 25px;
}
</style>
