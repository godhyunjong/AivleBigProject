<template>
    <div>
        <Number
            label="PhotoId"
            v-model="value.photoId"
            :editMode="editMode"
        />
        <String
            label="MemorialId"
            v-model="value.memorialId"
            :editMode="editMode"
        />
        <String
            label="Title"
            v-model="value.title"
            :editMode="editMode"
        />
        <String
            label="Path"
            v-model="value.path"
            :editMode="editMode"
        />
        <Date
            label="UploadedAt"
            v-model="value.uploadedAt"
            :editMode="editMode"
        />
        <Tags
            offline
            label="Tag"
            v-model="value.tag"
            :editMode="editMode"
            @change="change"
        />
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
    name: 'Photo',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "photos",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
