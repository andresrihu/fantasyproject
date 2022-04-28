<template>
    <div class="content">
        <h2>Athlete Name</h2>
        <AthleteDetailedInfo/>
    </div>
    
    <Footer/>
</template>

<script>
import AthleteDetailedInfo from '../components/AthleteDetailedInfo.vue'
import Footer from '../components/Footer.vue'

export default{
    name: "AthleteViewOne",
    components:{
        AthleteDetailedInfo: AthleteDetailedInfo,
        Footer : Footer,
    }
        
    
}
</script>

<style scoped>
    .content{
        margin-top: 10px;
        
    }
</style>
