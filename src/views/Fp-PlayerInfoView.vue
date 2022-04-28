<template>
    <div class="content">
        <PlayerInfo/>
        <Footer/>
    </div>
</template>

<script>
import PlayerInfo from '../components/PlayerInfo.vue'
import Footer from '../components/Footer.vue'
export default {
    name: 'playerInfo',
    components: {
        PlayerInfo : PlayerInfo,
        Footer : Footer
    }
}
</script>

<style scoped>
    .content{
        margin : 10px;
    }
</style>