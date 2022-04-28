<template>
  <div class="maincontainer">
    <button class="btn btn-primary">Create League</button>
    <div class="innercontainer">
      <div class="leftcontainer">
        <h2>Fantasy Data</h2>
        <TopAthletePicks />
      </div>
      <div class="rightcontainer">
        <h2>Player Injuries</h2>
        <AthleteInjuryList id="list" />
      </div>
    </div>
    <div class="innercontainer">
      <PlayerLeagueList />
    </div>
  </div>
</template>

<script>
import TopAthletePicks from "@/components/TopAthletePicks.vue";
import AthleteInjuryList from "@/components/AthleteInjuryList.vue";
import PlayerLeagueList from "@/components/PlayerLeagueList.vue";
export default {
  name: "FantasyHomeView",
  components: {
    TopAthletePicks: TopAthletePicks,
    AthleteInjuryList: AthleteInjuryList,
    PlayerLeagueList: PlayerLeagueList,
  },
};
</script>

<style scoped>
button {
  margin-top: 40px;
  margin-bottom: 20px;
}
.maincontainer {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.innercontainer {
  display: flex;
}
.leftcontainer,
.righcontainer {
  margin: 0px 25px;
}
#list {
  max-height: 200px;
  overflow-y: scroll;
}
</style>
