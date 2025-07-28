<template>
    <div>
        <Number
            label="VideoId"
            v-model="value.videoId"
            :editMode="editMode"
        />
        <String
            label="MemorialId"
            v-model="value.memorialId"
            :editMode="editMode"
        />
        <String
            label="VideoPath"
            v-model="value.videoPath"
            :editMode="editMode"
        />
        <String
            label="VideoTitle"
            v-model="value.videoTitle"
            :editMode="editMode"
        />
        <Date
            label="CreatedAt"
            v-model="value.createdAt"
            :editMode="editMode"
        />
        <String
            label="Keyword"
            v-model="value.keyword"
            :editMode="editMode"
        />
        <v-divider class="border-opacity-50 my-divider my-2"></v-divider>
        <div variant="outlined" class="my-2">
            <Number
                label="ImageIdList"
                v-model="imageIdListInput"
                :editMode="editMode"
                @keydown.enter="addImageIdListList"
            />
            <v-card v-if="value.imageIdList.length > 0" variant="outlined" class="pa-4 mt-2">
                <v-card-sub-title>
                    ImageIdList List
                </v-card-sub-title>
                <li v-for="(name, index) in value.imageIdList" :key="index">
                    {{ name }}
                </li>
            </v-card>
            <v-row class="ma-0 pa-0 mt-2">
                <v-spacer></v-spacer>
                <v-btn @click="addImageIdListList">
                    ImageIdList 추가
                </v-btn>
            </v-row>
            
            <LongDetailGrid
                label="ImageIdList"
                offline
                v-model="value.imageIdList"
                :editMode="editMode"
                @change="change"
            />
        </div>
        <v-divider class="border-opacity-50 my-divider my-2"></v-divider>
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'Video',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "videos",
        imageIdListInput: null,
        value: {
            imageIdList: [],
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
        addImageIdListList() {
            if (this.imageIdListInput !== null && this.imageIdListInput !== '') {
                this.value.imageIdList.push(this.imageIdListInput);
                this.imageIdListInput = null; // null로 초기화
            }
        },
    },
}
</script>
