<template>
    <div class="content">
        <h2>Athlete Name</h2>
        <AthleteDetailedInfo/>
    </div>
</template>

<script>
import AthleteDetailedInfo from '../components/AthleteDetailedInfo.vue'

export default{
    name: "AthleteViewOne",
    components:{
        AthleteDetailedInfo: AthleteDetailedInfo,

    }
        
    
}
</script>

<style scoped>
    .content{
        margin-top: 10px;
        
    }
</style>
