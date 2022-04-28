<template>
  <div class="content">
    <PlayerInfo />
    <PlayerLeagueList />
  </div>
</template>

<script>
import PlayerLeagueList from "@/components/PlayerLeagueList.vue";
import PlayerInfo from "../components/PlayerInfo.vue";
export default {
  name: "playerInfo",
  components: {
    PlayerInfo: PlayerInfo,
    PlayerLeagueList: PlayerLeagueList,
  },
};
</script>

<style scoped>
.content {
  margin: 10px;
}
</style>
