<template>
  <div>
    <h1>Search for players or teams</h1>
    <div class="maincontainer">
      <div class="leftcontainer">
        <div class="topcontainer">
          <AthleteTeamSearch
            v-on:playerteam="setChoice(params)"
            v-on:searchvalue="setSearch(params)"
          />
        </div>
        <div class="bottomcontainer">
          <SearchResults
            :playerteam="choice"
            :search="inputsearch"
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
      search: "",
    };
  },
  methods: {
    setChoice(newChoice) {
      this.choice = newChoice;
      console.log(this.choice);
    },
    setSearch(newSearch) {
      this.search = newSearch;
      console.log(this.search);
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
