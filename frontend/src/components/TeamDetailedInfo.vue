<template>
  <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th>Year Founded</th>
        <th>Current Head Coach</th>
        <th>Career Wins</th>
        <th>Career Losses</th>
        <th>Win/Loss Ratio</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>{{ founded }}</td>
        <td>{{ coach }}</td>
        <td>{{ wins }}</td>
        <td>{{ losses }}</td>
        <td>{{ ratio }}</td>
      </tr>
    </tbody>
  </table>
</template>
<script>
export default {
  name: "TeamDetailedInfo",
  data() {
    return {
      founded: "1932",
      coach: "Bill Belichick",
      wins: "645",
      losses: "543",
      ratio: "1.22",
    };
  },
};
</script>
<style scoped></style>
