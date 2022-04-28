<template>
    <div class="content">
        <LeagueSettingsPlayer/>
    </div>
    
    <Footer/>
</template>


<script>
import LeagueSettingsPlayer from '../components/LeagueSettingsPlayer.vue'
import Footer from '../components/Footer.vue'

export default{
    name: "CreateLeague",
    components: {
        LeagueSettingsPlayer : LeagueSettingsPlayer,
        Footer: Footer,
    }
}
</script>


<style scoped>
    .content{
        margin-top: 10px;
    }
    
</style>
