<template>
    <div>
        <AvailablePlayers/>
        <div>
            <TimerTimer/>
            <CreateYourTeam/>
        </div>
    </div>
    <div>
        <PlayerDraftList/>
    </div>
    <Footer/>
</template>

<script>
import AvailablePlayers from '../components/AthletesAvailableDraft.vue'
import PlayerDraftList from '../components/PlayersDraftingList.vue'
import TimerTimer from '../components/Timer.vue'
import Footer from '../components/Footer.vue'


export default {
    name: "DraftPage",
    components:{
        Footer : Footer,
        PlayerDraftList : PlayerDraftList,
        TimerTimer : TimerTimer,
        AvailablePlayers : AvailablePlayers

    }
}
</script>