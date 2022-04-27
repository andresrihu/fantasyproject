<template>
    <div class="container">
        <div class="main">
            <h2>{{playerName}}</h2>
            <div id="circle"></div>
            <h3>{{teamName}}</h3>
            <a href="#">Update {{teamName}}</a>
        </div>
        <br>
        <div class="credentials">
            <form class="form" action="/register" method="post">

                <input class="form-control" type="text" placeholder="{{playerName}}">
                <br>
                <input class="form-control" type="text" placeholder="{{email}}">
                <br>
                <input class="form-control" type="password" placeholder="New Password">
                <br>
                <input class="btn btn-outline-primary" class="form-control" value="Edit">
            </form>
        </div>
        <h2 class="cardTitle p2">Member of:</h2>
        <div class="cardContainer p2 grid gap2 flex">
            <div class="card">
                <div class="card_head">
                    <h2 class="col_white1">{{leagueTeam}}</h2>
                </div>
                <div class="card_body">
                    <p>{{teamName}}</p>
                    <a href="#">Go To League</a>
                </div>
            </div>
            <div class="card">
                <div class="card_head">
                    <h2 class="col_white1">{{leagueTeam}}</h2>
                </div>
                <div class="card_body">
                    <p>{{teamName}}</p>
                    <a href="#">Go To League</a>
                </div>
            </div>
            <div class="card">
                <div class="card_head">
                    <h2 class="col_white1">{{leagueTeam}}</h2>
                </div>
                <div class="card_body">
                    <p>{{teamName}}</p>
                    <a href="#">Go To League</a>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: "PlayerInfo",
    data(){
        return{
            playerName:"Player Name",
            leagueTeam:"League Team Name",
            teamName:"Team Name",
            email:"email@fantasy.com"
        }

    }
}
</script>

<style scoped>
* {
    margin: 0;
    padding: 0;
}

.container {
    text-align: center;
    margin: 0 auto;
    width: 80%;
    height: 1000px;
    background-color: aliceblue;
}

#circle{
    width: 200px;
    height: 200px;
    border-radius: 50%;
    border: 1px solid black;
    margin: 0 auto;
}
.form{
    display: flex;
    flex-direction: column;
    width: 20%;
    margin: 0 auto;
}
.cardContainer{
    width: fit-content;
}
.cardTitle{
    text-align: left;
}

.card
{
	border:1px solid #e4e2e0;
	display:grid;
	grid-template-columns:1fr;
	background-color:#fff;
}

.card_head
{
	background-color:#17405c;
	padding:1rem;
	border-bottom:1px solid #e4e2e0;
	color:#fff;
}

.card_body
{
	padding:2rem;
	display:grid;
	gap:2rem;
}
.gap2{gap:2rem;}
.grid{display:grid;}
.flex{display:flex;}
.p1{padding:1rem;}
.p2{padding:2rem;}

</style>