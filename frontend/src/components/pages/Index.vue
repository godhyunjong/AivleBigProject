<template>
  <v-container fluid>
    <v-row>
      <v-card
          v-for="(card, index) in cards"
          :key="index"
          class="mx-auto"
          style="height:300px; width:300px; margin-bottom:20px;"
          outlined
      >
        <v-list-item>
          <v-icon style="margin-top: 30%; margin-left: 37.5%;" color="primary" size="64">mdi-apps</v-icon>
        </v-list-item>
        <v-card-actions>
          <v-btn
              class="mx-auto"
              outlined
              rounded
              :to="card.link"
              style="font-weight:500; font-size:20px; border:solid 2px; max-width:250px; overflow:hidden; margin-top: 10%;"
          >
              {{ card.text }}
          </v-btn>
        </v-card-actions>
      </v-card>
    </v-row>
  </v-container>
</template>

<script>
export default {
  name: 'Index',
  data: () => ({
    cards: [
      {
          text: "전환서비스",
          link: "/conversionServices",
      },
      {
          text: "상품 추천 메시지",
          link: "/recommendMessages",
      },
      {
          text: "고객",
          link: "/customerInfos",
      },
      {
          text: "장례 정보",
          link: "/funeralInfos",
      },
      {
          text: "DocumentFile",
          link: "/documentFiles",
      },
      {
          text: "CustomerReadmodel",
          link: "/customerReadmodels",
      },
      {
          text: "사용자",
          link: "/users",
      },
      {
          text: "고객프로필",
          link: "/customerProfiles",
      },
      {
          text: "추모관",
          link: "/memorials",
      },
      {
          text: "영상",
          link: "/videos",
      },
      {
          text: "사진",
          link: "/photos",
      },
      {
          text: "댓글",
          link: "/comments",
      },
      {
          text: "FamilyMember",
          link: "/familyMembers",
      },
      {
          text: "추모사",
          link: "/tributes",
      },
    ],
  }),
};
</script>
