<template>
  <div class="maincontainer list-group">
    <router-link
      :to="{ name: 'athleteInfo', params: { id: athlete.id } }"
      class="list-group-item list-group-item-action list-group-item-secondary"
      v-for="athlete in athletes"
      :key="athlete.id"
      >{{ athlete.name }}</router-link
    >
  </div>
</template>

<script>
import SearchResultService from "../services/SearchResultService";

export default {
  name: "SearchResults",
  data() {
    return {
      athletes: [],
    };
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
  },
  created() {
    this.getAllAthletes();
  },
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
