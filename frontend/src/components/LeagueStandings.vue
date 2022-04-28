<template>
  <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th scope="col">Rank</th>
        <th scope="col">Name</th>
        <th scope="col">Team</th>
        <th scope="col">Actions</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <th scope="row">1</th>
        <td>Jason Doe</td>
        <td>TeamName1</td>
        <td><router-link to="/viewPlayer">View Profile</router-link></td>
      </tr>
      <tr>
        <th scope="row">2</th>
        <td>Joel Doe</td>
        <td>TeamName2</td>
        <td><router-link to="/viewPlayer">View Profile</router-link></td>
      </tr>
      <tr>
        <th scope="row">3</th>
        <td>Jane Doe</td>
        <td>TeamName3</td>
        <td><router-link to="/viewPlayer">View Profile</router-link></td>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: "LeagueStandings",
  data() {
    return {
      
    };
  },
};
</script>

<style scoped>

</style>