import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/conversionServices',
      component: () => import('../components/ui/ConversionServiceGrid.vue'),
    },
    {
      path: '/recommendMessages',
      component: () => import('../components/ui/RecommendMessageGrid.vue'),
    },
    {
      path: '/customerInfos',
      component: () => import('../components/CustomerInfoView.vue'),
    },
    {
      path: '/funeralInfos',
      component: () => import('../components/ui/FuneralInfoGrid.vue'),
    },
    {
      path: '/documentFiles',
      component: () => import('../components/ui/DocumentFileGrid.vue'),
    },
    {
      path: '/customerReadmodels',
      component: () => import('../components/CustomerReadmodelView.vue'),
    },
    {
      path: '/users',
      component: () => import('../components/ui/UserGrid.vue'),
    },
    {
      path: '/customerProfiles',
      component: () => import('../components/ui/CustomerProfileGrid.vue'),
    },
    {
      path: '/memorials',
      component: () => import('../components/ui/MemorialGrid.vue'),
    },
    {
      path: '/videos',
      component: () => import('../components/ui/VideoGrid.vue'),
    },
    {
      path: '/photos',
      component: () => import('../components/ui/PhotoGrid.vue'),
    },
    {
      path: '/comments',
      component: () => import('../components/ui/CommentGrid.vue'),
    },
    {
      path: '/familyMembers',
      component: () => import('../components/ui/FamilyMemberGrid.vue'),
    },
    {
      path: '/tributes',
      component: () => import('../components/ui/TributeGrid.vue'),
    },
  ],
})

export default router;
