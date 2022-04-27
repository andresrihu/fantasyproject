<template>
  <div class="statcontainer">
    <div class="card-body">
      <h2 class="card-title">{{ name }}</h2>
      <p class="card-subtitle text-muted">{{ founded }}</p>
      <p class="card-text">Head Coach: {{ coach }}</p>
      <p class="card-text">Quarterback: {{ qb }}</p>
    </div>
  </div>
</template>

<script>
export default {
  name: "TeamStatsCard",
  data() {
    return {
      founded: "1932",
      coach: "Bill Belichick",
      name: "Patriots",
      qb: "Mac Jones",
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
