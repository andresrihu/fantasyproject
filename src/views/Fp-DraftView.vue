<template>
  <div>
    <AvailablePlayers />
    <div>
      <TimerTimer />
      <CreateYourTeam />
    </div>
  </div>
  <div>
    <PlayerDraftList />
  </div>
</template>

<script>
import AvailablePlayers from "../components/AthletesAvailableDraft.vue";
import PlayerDraftList from "../components/PlayersDraftingList.vue";
import TimerTimer from "../components/TimerCountDown.vue";

export default {
  name: "DraftPage",
  components: {
    PlayerDraftList: PlayerDraftList,
    TimerTimer: TimerTimer,
    AvailablePlayers: AvailablePlayers,
  },
};
</script>
