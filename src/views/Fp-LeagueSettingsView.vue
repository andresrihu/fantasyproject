<template>
    <div class="content">
        <LeagueSAdmin/>
        <LeagueSPlayer/>
    </div>
</template>

<script>
import LeagueSAdmin from '../components/LeagueSettingsAdmin.vue'
import LeagueSPlayer from '../components/LeagueSettingsPlayer.vue'

export default {
    name: "settingsAdminPlayer",
    components: {
        LeagueSAdmin : LeagueSAdmin,
        LeagueSPlayer : LeagueSPlayer
    }
}
</script>

<style scoped>
    .content{
        display: flex;
    }
</style>