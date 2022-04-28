<template>
  <h2>Players Drafting:</h2>
  <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th scope="col">Next up to Pick</th>
        <th scope="col">Player Name</th>
        <th scope="col">Team Name</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <th scope="row">---></th>
        <td>Jason Doe</td>
        <td>TeamName1</td>
      </tr>
      <tr>
        <th scope="row">---></th>
        <td>Joel Doe</td>
        <td>TeamName2</td>
      </tr>
      <tr>
        <th scope="row">---></th>
        <td>Jane Doe</td>
        <td>TeamName3</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: "PlayerDraftingList",
  data() {
    return {
      
    };
  },
};
</script>

<style scoped>

</style>