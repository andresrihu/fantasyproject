<template>
  <div class="teamleaguecontainer">
    <div class="card-body">
      <h2 class="card-title">{{ name }}</h2>
      <p class="card-subtitle text-muted">{{ manager }}</p>
    </div>
  </div>
</template>

<script>
export default {
  name: "TeamLeagueCard",
  data() {
    return {
      name: "Donnys Dudes",
      manager: "Carmen Shannon",
    };
  },
};
</script>

<style scoped>
.teamleaguecontainer {
  border: 2px solid black;
  border-radius: 10px;
  padding: 10px;
  background-color: #c0c0c08a;
  box-shadow: 5px 5px black;
}
</style>
