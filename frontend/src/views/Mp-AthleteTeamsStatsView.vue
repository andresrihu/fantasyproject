<template>
  <div>
    <h1>Search for players or teams</h1>
    <div class="maincontainer">
      <div class="leftcontainer">
        <div class="topcontainer">
          <AthleteTeamSearch />
        </div>
        <div class="bottomcontainer">
          <SearchResults
            :playerteam="choice"
            :search="inputsearch"
            @setprops="searchParam(search, playerteam)"
            id="search"
          />
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import AthleteTeamSearch from "@/components/AthleteTeamSearch.vue";
import SearchResults from "@/components/SearchResults.vue";

export default {
  name: "AthleteTeamsStatsView",
  components: {
    AthleteTeamSearch: AthleteTeamSearch,
    SearchResults: SearchResults,
  },
  data() {
    return {
      choice: "player",
      search: '',
    };
  },
  methods: {
    setProps(search, newChoice) {
      this.choice = newChoice;
      this.search = search;
    },
  },
};
</script>

<style scoped>
#search {
  z-index: 0;
  max-height: 400px;
  overflow-y: scroll;
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
