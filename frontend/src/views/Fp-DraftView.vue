<template>
  <div>
    <div class="box">
      <AvailablePlayers />
      <TimerTimer />
      <PlayerPicks />
    </div>
    <div >
      <PlayerDraftList />
    </div>
  </div>
  
</template>

<script>
import AvailablePlayers from "../components/AthletesAvailableDraft.vue";
import PlayerDraftList from "../components/PlayersDraftingList.vue";
import TimerTimer from "../components/TimerCountDown.vue";
import PlayerPicks from "../components/PlayerAthletePicks.vue";

export default {
  name: "DraftPage",
  components: {
    PlayerDraftList: PlayerDraftList,
    TimerTimer: TimerTimer,
    AvailablePlayers: AvailablePlayers,
    PlayerPicks: PlayerPicks,
  },
};
</script>

<style scoped>
.box {
  display: flex;
  margin-top: 10px;
}
.timeBox {
  height: 100px;
  display: flex;
  flex-direction: column;
  align-items: center;
}
.draftList {
  display: flex;
}
</style>
