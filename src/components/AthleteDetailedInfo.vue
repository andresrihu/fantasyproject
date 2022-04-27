<template>
  <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th>Games Played</th>
        <th>Career Wins</th>
        <th>Career Losses</th>
        <th>Career Receptions</th>
        <th>Career Receiving Yards</th>
        <th>Career Rushing Attempts</th>
        <th>Career Rushing Yards</th>
        <th>Career Receiving TD's</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>{{ totalGames }}</td>
        <td>{{ wins }}</td>
        <td>{{ losses }}</td>
        <td>{{ receptions }}</td>
        <td>{{ rcvYds }}</td>
        <td>{{ rshYds }}</td>
        <td>{{ rshAtt }}</td>
        <td>{{ rcvTds }}</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: "AthleteDetailedInfo",
  data() {
    return {
      totalGames: "432",
      wins: "314",
      losses: "118",
      receptions: "1248",
      rcvYds: "31245",
      rshYds: "1234",
      rshAtt: "32",
      rcvTds: "12",
    };
  },
};
</script>

<style scoped></style>
