<template>
  <div class="statcontainer">
    <h2>{{ name }}</h2>
    <p id="founded">Year Founded: {{ founded }}</p>
    <p id="coach">Head Coach: {{ coach }}</p>
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
