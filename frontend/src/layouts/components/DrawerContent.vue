<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: '전환서비스' }" />
        <VerticalNavLink
            :item="{
                title: '전환서비스',
                to: '/conversionServices',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '상품 추천 메시지',
                to: '/recommendMessages',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '고객',
                to: '/customerInfos',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'funeral-context' }" />
        <VerticalNavLink
            :item="{
                title: '장례 정보',
                to: '/funeralInfos',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'DocumentFile',
                to: '/documentFiles',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'CustomerReadmodel',
                to: '/customerReadmodels',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'user-context' }" />
        <VerticalNavLink
            :item="{
                title: '사용자',
                to: '/users',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '고객프로필',
                to: '/customerProfiles',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'memorial-context' }" />
        <VerticalNavLink
            :item="{
                title: '추모관',
                to: '/memorials',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '영상',
                to: '/videos',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '사진',
                to: '/photos',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '댓글',
                to: '/comments',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'FamilyMember',
                to: '/familyMembers',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '추모사',
                to: '/tributes',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'LLM' }" />
    </ul>
</template>
