<template>
  <div class="maincontainer">
    <h1>{{ teamName }}</h1>
    <div class="topcontainer">
      <h3>Active Players</h3>
      <TeamActiveAthletes id="taa" />
    </div>
    <div class="bottomcontainer">
      <h3>Statistics</h3>
      <TeamDetailedInfo />
    </div>
  </div>
</template>

<script>
import TeamActiveAthletes from "../components/TeamActiveAthletes.vue";
import TeamDetailedInfo from "../components/TeamDetailedInfo.vue";

export default {
  name: "TeamInfoView",
  data() {
    return {
      teamName: "Patriots",
    };
  },
  components: {
    TeamActiveAthletes: TeamActiveAthletes,
    TeamDetailedInfo: TeamDetailedInfo,
  },
};
</script>

<style scoped>
#taa {
  margin-bottom: 25px;
}
h1 {
  color: black;
  margin-bottom: 25px;
}
h3 {
  margin-bottom: 25px;
}
.maincontainer {
  display: flex;
  flex-direction: column;
}
.topcontainer,
.bottomcontainer {
  margin: 0px 30px;
}
</style>
