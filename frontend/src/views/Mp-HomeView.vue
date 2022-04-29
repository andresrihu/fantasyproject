<template>
  <div class="cont">
    <div class="container">
      <div class="row mt-5 mb-5">
        <div class="col-sm-12">
          <div
            id="carouselExampleIndicators"
            class="carousel slide"
            data-bs-ride="carousel"
          >
            <div class="carousel-indicators">
              <button
                type="button"
                data-bs-target="#carouselExampleIndicators"
                data-bs-slide-to="0"
                class="active"
                aria-current="true"
                aria-label="Slide 1"
              ></button>
              <button
                type="button"
                data-bs-target="#carouselExampleIndicators"
                data-bs-slide-to="1"
                aria-label="Slide 2"
              ></button>
              <button
                type="button"
                data-bs-target="#carouselExampleIndicators"
                data-bs-slide-to="2"
                aria-label="Slide 3"
              ></button>
            </div>
            <div class="carousel-inner">
              <!-- ITEM 1 -->
              <div class="carousel-item active card">
                <router-link to="/fantasyhome">
                  <div class="card-img-overlay">
                    <h1 class="opaque">
                      Who is on your
                      <span style="color:red;">Fantasy Platform</span> Team?
                    </h1>
                    <h2 class="opaque">Join the Revolution!</h2>
                  </div>
                  <img
                    src="../assets/brady.jpg"
                    class="d-block w-100"
                    alt="brady"
                  />
                </router-link>
              </div>
              <!-- ITEM 2 -->
              <div class="carousel-item card">
                <router-link to="/stats">
                  <div class="card-img-overlay opaque" style="z-index: 0">
                    <h1 class="opaque">
                      Live <span style="color: red">Games Stats</span>
                    </h1>
                    <h2 class="opaque">Never Miss a Play!</h2>
                  </div>
                  <img
                    src="../assets/football1.jpg"
                    class="d-block w-100 transparent"
                    alt="..."
                  />
                </router-link>
              </div>
              <!-- ITEM 2 -->
              <div class="carousel-item card">
                <router-link to="/search">
                  <div class="card-img-overlay">
                    <h1>Search for More</h1>
                    <h2>
                      Home of all things
                      <span style="color: red">Statistics</span> of your favourite
                      players and teams!
                    </h2>
                  </div>
                  <img
                    src="../assets/football2.jpg"
                    class="d-block w-100"
                    alt="..."
                  />
                </router-link>
              </div>
            </div>
            <button
              class="carousel-control-prev"
              type="button"
              data-bs-target="#carouselExampleIndicators"
              data-bs-slide="prev"
            >
              <span
                class="carousel-control-prev-icon"
                aria-hidden="true"
              ></span>
              <span class="visually-hidden">Previous</span>
            </button>
            <button
              class="carousel-control-next"
              type="button"
              data-bs-target="#carouselExampleIndicators"
              data-bs-slide="next"
            >
              <span
                class="carousel-control-next-icon"
                aria-hidden="true"
              ></span>
              <span class="visually-hidden">Next</span>
            </button>
            <!-- SPINNING FOOTBALL -->

            <div class="d-flex justify-content-center" style="margin-top: 10px">
              <img
                src="../assets/spinning.gif"
                alt="football"
                style="height: 30px"
              />
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
//importing bootstrap 5
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.min.js";
import * as Bootstrap from "bootstrap";
//import DemoComponent from "./components/DemoComponent.vue"

export default {
  mounted() {
    var myCarousel = document.querySelector("#myCarousel");
    new Bootstrap.Carousel(myCarousel);
  },
  data: function () {
    return {
      fantasy: "/fantasyhome",
      stats: "/search",
      live: "/athleteInfo"

    };
  },
};
</script>

<style scoped>
h1,
p {
  font-family: "Roboto Slab", serif;
  color: blue;
}
.carousel-item {
  height: 42rem;
  background: rgb(133, 132, 132);
  position: relative;
  background-position: center;
  background-size: cover;
}

.opaque {
  opacity: 1;
  z-index: 99;
}
.transparent {
  opacity: 0.5;
}

.card-img-overlay {
  color: rgb(251, 255, 0);
  /* top: inherit; */
  /* font-size: x-large; */
}
</style>
