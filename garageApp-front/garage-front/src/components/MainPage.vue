<template>
  <v-container style="display: inline-flexbox">
    <v-row>
      <v-col class="col-4"><CarCard /></v-col>
      <v-col class="col-4"><CarCard /></v-col>
      <v-col class="col-4"><CarCard /></v-col>
    </v-row>
  </v-container>
</template>

<script>
import CarCard from "../components/CarCard.vue";

export default {
  name: "MainPage",
  data: () => ({}),
  components: { CarCard },
};
</script>
