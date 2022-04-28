<template>
  <div
    id="myCarousel"
    class="carousel slide carousel-fade"
    data-bs-ride="carousel"
  >
    <ol class="carousel-indicators">
      <!-- INDICATORS -->
      <li data-bs-target="#myCarousel" data-bs-slide-to="0" class="active"></li>
      <li data-bs-target="#myCarousel" data-bs-slide-to="1"></li>
      <li data-bs-target="#myCarousel" data-bs-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
      <!-- CAROUSEL ITEM 1 -->
      <div class="carousel-item" data-interval="2000">
        <!-- IMAGE 1 -->
        <div class="overlay-image">
          <a href="google.com">
            <img src="../assets/brady.jpg" alt="tim brady" />
          </a>
        </div>
        <div class="container">
          <h1>
            Who is on your
            <span style="color: red">Fantasy Platform</span> Team?
          </h1>
          <p>Join the Revolution!</p>
          <a href="#" class="btn btn-lg btn-primary"> Fantasy Platform! </a>
        </div>
      </div>
      <!-- CAROUSEL ITEM 2 -->
      <div class="carousel-item active" data-interval="1000">
        <!-- IMAGE 2 -->
        <div
          class="overlay-image"
          style="background-image: url(../assets/footballman.jpg)"
        ></div>
        <div class="container">
          <h1>Live <span style="color: red">Games</span></h1>
          <p>Never Miss a Play!</p>
          <a href="#" class="btn btn-lg btn-primary"> Live Game Stats! </a>
        </div>
      </div>
      <!-- CAROUSEL ITEM 3 -->
      <div class="carousel-item" data-interval="1000">
        <!-- IMAGE 3 -->
        <div
          class="overlay-image"
          style="background-image: url(../assets/champ.jpg)"
        ></div>
        <div class="container">
          <h1>Current Stats</h1>
          <p>
            Home of all things <span style="color: red">Statistics</span> of
            your favourite players and teams!
          </p>
          <a href="#" class="btn btn-lg btn-primary"> Current Stats! </a>
        </div>
      </div>
    </div>
    <!-- LEFT ARROW TO PREVIOUS -->
    <a
      href="#myCarousel"
      class="carousel-control-prev"
      role="button"
      data-bs-slide="prev"
    >
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <!-- RIGHT ARROW TO NEXT IMAGE -->
    <a
      href="#myCarousel"
      class="carousel-control-next"
      role="button"
      data-bs-slide="next"
    >
      <span class="sr-only">Next</span>
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
    </a>
  </div>
  <!-- SPINNING FOOTBALL -->
  <div class="d-flex justify-content-center" style="margin-top: 10px">
    <img src="../assets/spinning.gif" alt="football" style="height: 30px" />
  </div>
</template>

<script>
export default {
  name: "HomeView",
  components: {},
  data: () => ({
    slides: [
      "../assets/brady.jpg",
      "../assets/champ.jpg",
      "../assets/footballman.jpg",
    ],
    visibleSlide: 0,
  }),
};
</script>

<style>
h1,
p {
  font-family: "Roboto Slab", serif;
}
.carousel{
  width: 1500px;
  height: 1500px;
  margin-top: 10px;
}
.carousel-item {
  height: 32rem;
  background: rgb(133, 132, 132);
  position: relative;
  background-position: center;
  background-size: cover;
}

.container {
  position: absolute;
  bottom: 0;
  left: 0;
  right: 0;
  padding-bottom: 50px;
}

.overlay-image {
  position: absolute;
  bottom: 0;
  left: 0;
  right: 0;
  top: 0;
  background-position: center;
  background-size: cover;
  opacity: 0.5;
}

#myCarousel{
  margin-top: 20px;
}

.mask-custom {
  background: rgba(24, 24, 16, 0.2);
  border-radius: 2em;
  backdrop-filter: blur(15px);
  border: 2px solid rgba(255, 255, 255, 0.05);
  background-clip: padding-box;
  box-shadow: 10px 10px 10px rgba(46, 54, 68, 0.03);
}


</style>
