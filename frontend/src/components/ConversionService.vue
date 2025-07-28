<template>
    <div>
        <Number
            label="ServiceId"
            v-model="value.serviceId"
            :editMode="editMode"
        />
        <String
            label="전환서비스 이름"
            v-model="value.serviceName"
            :editMode="editMode"
        />
        <String
            label="전환서비스 이미지"
            v-model="value.imageUrl"
            :editMode="editMode"
        />
        <String
            label="상세정보 페이지 url"
            v-model="value.detailedUrl"
            :editMode="editMode"
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
    name: 'ConversionService',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "conversionServices",
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
