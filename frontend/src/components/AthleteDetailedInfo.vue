<template>
  <div class="maincontainer">
    <h2>{{ $props.athleteview.name }}</h2>
    <table class="table table-dark table-hover">
      <thead>
        <tr>
          <th>Age</th>
          <th>Position</th>
          <th>Average Fantasy PPG</th>
          <th>Rank</th>
          <th>Career Games Started</th>
          <th>Career Passing Yards</th>
          <th>Career Passing TDs</th>
          <th>Career Rushing Yards</th>
          <th>Career Rushing TDs</th>
          <th>Career Receiving Yards</th>
          <th>Career Receiving TDs</th>
          <th>Career Field Goals</th>
          <th>Team</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>{{ $props.athleteview.age }}</td>
          <td>{{ $props.athleteview.pos }}</td>
          <td>{{ $props.athleteview.fantasyPpg }}</td>
          <td>{{ $props.athleteview.playerRank }}</td>
          <td>{{ $props.athleteview.started }}</td>
          <td>{{ $props.athleteview.passingYds }}</td>
          <td>{{ $props.athleteview.passingTds }}</td>
          <td>{{ $props.athleteview.rushingYds }}</td>
          <td>{{ $props.athleteview.rushingTds }}</td>
          <td>{{ $props.athleteview.recYds }}</td>
          <td>{{ $props.athleteview.recTds }}</td>
          <td>{{ $props.athleteview.fieldGoals }}</td>
          <td>{{ $props.athleteview.team.slice(0, 3) }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
/* eslint-disable */
// const axios = require("axios");

// const API_URL = `http://localhost:8080/athletes/${this.id}`

// console.log(this.getProps);

export default {
  name: "AthleteDetailedInfo",
  data() {
    return {};
  },
  props: {
    athleteview: {
      type: Object,
      required: true,
    },
  },
};
</script>

<style scoped></style>
