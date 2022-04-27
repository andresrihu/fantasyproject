<template>
    <div>
        <div class="listDiv">
            <h1>Injury List</h1>
            <ul class="list-group listItems">
                <li class="list-group-item">{{athleteName}}</li>
                <li class="list-group-item">{{athleteName}}</li>
                <li class="list-group-item">{{athleteName}}</li>
            </ul>
        </div>
    </div>
</template>

<script>

export default {
    name: "InjuryList",
    data() {
        return{

            athleteName: ""
        }
    },
}
</script>

<style scoped>
    
    .listDiv{
        margin: 40px 40px;
        padding: 0;
        
    }
    .listItems{
        
        width: 500px;
        border: 2px solid black;
    }

</style>
