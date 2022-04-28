<template>
<<<<<<< HEAD
    <div class="content1">
        <div>
            <AvailablePlayers/>
        </div>
        <div>
            <div class="timer">
                <TimerTimer/>
                <div>
                    <PlayerDraftList/>
                </div>
            </div>

        </div>
    </div>
    <div>
        <PlayAthletePicks/>
    </div>
    <Footer/>
</template>

<script>
import AvailablePlayers from '../components/AthletesAvailableDraft.vue'
import PlayerDraftList from '../components/PlayersDraftingList.vue'
import TimerTimer from '../components/TimerCountDown.vue'
import PlayAthletePicks from '../components/PlayerAthletePicks.vue'
import Footer from '../components/Footer.vue'


export default {
    name: "DraftPage",
    components:{
        Footer : Footer,
        PlayerDraftList : PlayerDraftList,
        TimerTimer : TimerTimer,
        AvailablePlayers : AvailablePlayers,
        PlayAthletePicks : PlayAthletePicks

    }
}
</script>

<style>
    .content1{
        display: flex;
        margin-top: 50px;

    }
    .timer{
        display: flex;
        justify-content: center;
    }
</style>
=======
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
>>>>>>> 71c49f666692f374d3ad83ddf9f47fe3461a9ff7
