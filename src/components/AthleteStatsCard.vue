<template>
  <div class="statcontainer">
    <div class="card-body">
      <h2 class="card-title">{{ name }}</h2>
      <p class="card-subtitle text-muted">{{ position }}</p>
      <p class="card-text">Current Team: {{ team }}</p>
      <p class="card-text">Superbowl Wins: {{ rings }}</p>
    </div>
  </div>
</template>

<script>
export default {
  name: "AthleteStatsCard",
  data() {
    return {
      name: "Tom Brady",
      position: "Quarterback",
      team: "Buccaneers",
      rings: "A lot",
    };
  },
};
</script>

<style scoped>
.statcontainer {
  border: 2px solid black;
  border-radius: 10px;
  padding: 10px;
  background-color: #c0c0c08a;
  box-shadow: 5px 5px black;
}
</style>
