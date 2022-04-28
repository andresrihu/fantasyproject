<template>
  <div>
    <div class="listDiv">
      <ul class="list-group listItems">
        <li class="list-group-item list-group-item-action">
          {{ athleteName }}
        </li>
        <li class="list-group-item list-group-item-action">
          {{ athleteName }}
        </li>
        <li class="list-group-item list-group-item-action">
          {{ athleteName }}
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: "InjuryList",
  data() {
    return {
      athleteName: "Player",
    };
  },
};
</script>

<style scoped></style>
