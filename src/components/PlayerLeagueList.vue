<template>
  <div class="cardContainer p2 grid gap2 flex">
    <div class="card">
      <div class="card_head">
        <h2 class="col_white1">{{ leagueTeam }}</h2>
      </div>
      <div class="card_body">
        <p>{{ teamName }}</p>
        <router-link to="#">Go To League</router-link>
      </div>
    </div>
    <div class="card">
      <div class="card_head">
        <h2 class="col_white1">{{ leagueTeam }}</h2>
      </div>
      <div class="card_body">
        <p>{{ teamName }}</p>
        <router-link to="#">Go To League</router-link>
      </div>
    </div>
    <div class="card">
      <div class="card_head">
        <h2 class="col_white1">{{ leagueTeam }}</h2>
      </div>
      <div class="card_body">
        <p>{{ teamName }}</p>
        <router-link to="#">Go To League</router-link>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "PlayerLeagueList",
  data() {
    return {
      leagueTeam: "League Team Name",
      teamName: "Team Name",
    };
  },
};
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
}

.container {
  text-align: center;
  margin: 0 auto;
  width: 500px;
  background-color: aliceblue;
}

.cardContainer {
  width: fit-content;
}
.cardTitle {
  text-align: left;
}

.card {
  border: 1px solid #e4e2e0;
  display: grid;
  grid-template-columns: 1fr;
  background-color: #fff;
}

.card_head {
  background-color: #17405c;
  padding: 1rem;
  border-bottom: 1px solid #e4e2e0;
  color: #fff;
}

.card_body {
  padding: 2rem;
  display: grid;
  gap: 2rem;
}
.gap2 {
  gap: 2rem;
}
.grid {
  display: grid;
}
.flex {
  display: flex;
}
.p1 {
  padding: 1rem;
}
.p2 {
  padding: 2rem;
}
</style>
