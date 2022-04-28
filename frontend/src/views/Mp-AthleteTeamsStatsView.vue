<template>
  <h1>Search for players or teams</h1>
  <div class="maincontainer">
    <div class="leftcontainer">
      <div class="topcontainer">
        <AthleteTeamSearch />
      </div>
      <div class="bottomcontainer">
        <SearchResults id="search" />
      </div>
    </div>
    <div class="rightcontainer">
      <TeamStatsCard />
      <TeamStatsCard />
      <AthleteStatsCard />
      <AthleteStatsCard />
    </div>
  </div>
</template>

<script>
import AthleteTeamSearch from "@/components/AthleteTeamSearch.vue";
import SearchResults from "@/components/SearchResults.vue";
import TeamStatsCard from "@/components/TeamStatsCard.vue";
import AthleteStatsCard from "@/components/AthleteStatsCard.vue";
export default {
  name: "AthleteTeamsStatsView",
  components: {
    AthleteTeamSearch: AthleteTeamSearch,
    SearchResults: SearchResults,
    TeamStatsCard: TeamStatsCard,
    AthleteStatsCard: AthleteStatsCard,
  },
};
</script>

<style scoped>
#search {
  z-index: 0;
}
h1 {
  color: black;
}
.maincontainer {
  display: flex;
  align-items: center;
  justify-content: flex-start;
}
.leftcontainer,
.rightcontainer {
  margin: 0px 35px;
}
</style>
