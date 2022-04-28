<template>
  <h2>Player Picks:</h2>
  <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th scope="col">Pick</th>
        <th scope="col">Name</th>
        <th scope="col">Position</th>
        <th scope="col">TeamName</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <th scope="row">1</th>
        <td>Jason Doe</td>
        <td>Quarterback</td>
        <td>Team1</td>
      </tr>
      <tr>
        <th scope="row">2</th>
        <td>Joel Doe</td>
        <td>Runningback</td>
        <td>Team3</td>
      </tr>
      <tr>
        <th scope="row">3</th>
        <td>Jane Doe</td>
        <td>Kicker</td>
        <td>Team2</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: "PlayerAthletePicks",
  data() {
    return {
      
    };
  },
};
</script>

<style scoped>

</style>