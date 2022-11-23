<template>
  <v-app>
    <!-- <v-app-bar
      absolute
      color="#6A76AB"
      dark
      shrink-on-scroll
      prominent
      src="../assets/pexels-cottonbro-studio-4488637.jpg"
      fade-img-on-scroll
      scroll-target="#scrolling-techniques-3"
    >
      <template v-slot:img="{ props }">
        <v-img
          v-bind="props"
          gradient="to top right, rgba(100,115,201,.7), rgba(25,32,72,.7)"
        ></v-img>
      </template>

      <v-col class="offset-4">
        <v-app-bar-title
          style="font-size: 63px; font-family: Cursive"
          class="ml-16"
          >GarageApp</v-app-bar-title
        >
      </v-col>
      <v-spacer></v-spacer>

      <v-btn icon>
        <v-icon>mdi-magnify</v-icon>
      </v-btn>

      <v-btn icon>
        <v-icon>mdi-heart</v-icon>
      </v-btn>

      <v-btn icon>
        <v-icon>mdi-dots-vertical</v-icon>
      </v-btn>

      <v-app-bar-nav-icon></v-app-bar-nav-icon>

      <template v-slot:extension>
        <v-tabs align-left>
          <v-tab><router-link to="/about">login page</router-link></v-tab>
          <v-tab>home page</v-tab>
        </v-tabs>
      </template>
    </v-app-bar> -->
    <MainPage style="margin-top: 25vh" />
    <router-view></router-view>
  </v-app>
</template>

<script>
import MainPage from "../components/MainPage.vue";

export default {
  name: "HomeView",
  data: () => ({
    //
  }),
  components: { MainPage },
};
</script>
