package com.imaima.thai_food_en.list_of_food

import android.content.Context
import com.imaima.thai_food_en.R

import com.imaima.thai_food_en.model.RecipeModel


class BigListOfFood(private val context: Context) {
    val recipes = listOf(

        //////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 1,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.satay_gai),
            imageResId = R.drawable.satay_gai_1_501,
            description = context.getString(R.string.satay_gai_description),
            ingredients = context.resources.getStringArray(R.array.satay_gai_ingredients),
            instructions = context.resources.getStringArray(R.array.satay_gai_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////
        RecipeModel(
            recipeId = 2,
            categoryOfFood = context.getString(R.string.soups),
            dishTitle = context.getString(R.string.tod_mun_pla),
            imageResId = R.drawable.tod_mun_pla_2,
            description = context.getString(R.string.tod_mun_pla_description),
            ingredients = context.resources.getStringArray(R.array.tod_mun_pla_ingredients),
            instructions = context.resources.getStringArray(R.array.tod_mun_pla_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 3,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.miang_kham),
            imageResId = R.drawable.miang_kham_3_500,
            description = context.getString(R.string.miang_kham_description),
            ingredients = context.resources.getStringArray(R.array.miang_kham_ingredients),
            instructions = context.resources.getStringArray(R.array.miang_kham_instructions),
        ),
////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeModel(
            recipeId = 4,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.kai_jiew),
            imageResId = R.drawable.kai_jiew_4_500,
            description = context.getString(R.string.kai_jiew_description),
            ingredients = context.resources.getStringArray(R.array.kai_jiew_ingredients),
            instructions = context.resources.getStringArray(R.array.kai_jiew_instructions),

            ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 5,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.thung_thong),
            imageResId = R.drawable.thung_thong_5,
            description = context.getString(R.string.thung_thong_description),
            ingredients = context.resources.getStringArray(R.array.thung_thong_ingredients),
            instructions = context.resources.getStringArray(R.array.thung_thong_ingredients)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 6,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.gung_chae_nam_pla),
            imageResId = R.drawable.gung_chae_nam_pla_6,
            description = context.getString(R.string.gung_chae_nam_pla_description),
            ingredients = context.resources.getStringArray(R.array.gung_chae_nam_pla_ingredients),
            instructions = context.resources.getStringArray(R.array.gung_chae_nam_pla_instructions),

            ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 7,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.hoi_tod),
            imageResId = R.drawable.hoi_tod_7,
            description = context.getString(R.string.hoi_tod_description),
            ingredients = context.resources.getStringArray(R.array.hoi_tod_ingredients),
            instructions = context.resources.getStringArray(R.array.hoi_tod_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 8,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.kai_ho_bai_toei),
            imageResId = R.drawable.kai_ho_bai_toei_8_600,
            description = context.getString(R.string.kai_ho_bai_toei_description),

            ingredients = context.resources.getStringArray(R.array.kai_ho_bai_toei_ingredients),
            instructions = context.resources.getStringArray(R.array.kai_jiew_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 9,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.som_tum),
            imageResId = R.drawable.som_tum_9_700,
            description = context.getString(R.string.som_tum_description),

            ingredients = context.resources.getStringArray(R.array.som_tum_ingredients),
            instructions = context.resources.getStringArray(R.array.som_tum_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 10,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.khao_niew_mamuang),
            imageResId = R.drawable.khao_niew_mamuang_10_500,
            description = context.getString(R.string.khao_niew_mamuang_description),

            ingredients = context.resources.getStringArray(R.array.khao_niew_mamuang_instructions),
            instructions = context.resources.getStringArray(R.array.khao_niew_mamuang_instructions),

            ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 11,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.laab_gai),
            imageResId = R.drawable.laab_gai_11,
            description = context.getString(R.string.laab_gai_description),

            ingredients = context.resources.getStringArray(R.array.laab_gai_ingredients),
            instructions = context.resources.getStringArray(R.array.laab_gai_instructions),

            ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 12,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.khai_luk_koei),
            imageResId = R.drawable.khai_luk_koei_12_500,
            description = context.getString(R.string.khai_luk_koei_description),

            ingredients = context.resources.getStringArray(R.array.khai_luk_koei_ingredients),
            instructions = context.resources.getStringArray(R.array.khai_luk_koei_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 13,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.tod_man_khao_pod),
            imageResId = R.drawable.tod_man_khao_pod_13,
            description = context.getString(R.string.tod_man_khao_pod_description),

            ingredients = context.resources.getStringArray(R.array.tod_man_khao_pod_ingredients),
            instructions = context.resources.getStringArray(R.array.tod_man_khao_pod_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 14,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.gai_hor_bai_toey),
            imageResId = R.drawable.gai_hor_bai_toey_14,
            description = context.getString(R.string.gai_hor_bai_toey_description),
            ingredients = context.resources.getStringArray(R.array.gai_hor_bai_toey_ingredients),
            instructions = context.resources.getStringArray(R.array.gai_hor_bai_toey_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 15,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.moo_ping),
            imageResId = R.drawable.moo_ping_15,
            description = context.getString(R.string.moo_ping_description),
            ingredients = context.resources.getStringArray(R.array.moo_ping_ingredients),
            instructions = context.resources.getStringArray(R.array.moo_ping_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 16,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.goong_sarong),
            imageResId = R.drawable.goong_sarong_16_500,
            description = context.getString(R.string.goong_sarong_description),
            ingredients = context.resources.getStringArray(R.array.goong_sarong_ingredients),
            instructions = context.resources.getStringArray(R.array.goong_sarong_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 17,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.kuay_tiew_lui_suan),
            imageResId = R.drawable.kuay_tiew_lui_suan_17_500,
            description = context.getString(R.string.kuay_tiew_lui_suan_description),
            ingredients = context.resources.getStringArray(R.array.kuay_tiew_lui_suan_ingredients),
            instructions = context.resources.getStringArray(R.array.kuay_tiew_lui_suan_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 18,
            categoryOfFood = context.getString(R.string.appetizers),
            dishTitle = context.getString(R.string.miang_pla_pao),
            imageResId = R.drawable.miang_pla_pao_18_500,
            description = context.getString(R.string.miang_pla_pao_description),
            ingredients = context.resources.getStringArray(R.array.miang_pla_pao_ingredients),
            instructions = context.resources.getStringArray(R.array.miang_pla_pao_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 20,
            categoryOfFood = context.getString(R.string.soups),
            dishTitle = context.getString(R.string.tom_kha_gai),
            imageResId = R.drawable.tom_kha_gai_20_500,
            description = context.getString(R.string.tom_kha_gai_description),
            ingredients = context.resources.getStringArray(R.array.tom_kha_gai_ingredients),
            instructions = context.resources.getStringArray(R.array.tom_kha_gai_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 21,
            categoryOfFood = context.getString(R.string.soups),
            dishTitle = context.getString(R.string.tom_yum_goong),
            imageResId = R.drawable.tom_yum_goong_21_600,
            description = context.getString(R.string.tom_yum_goong_description),
            ingredients = context.resources.getStringArray(R.array.tom_yum_goong_ingredients),
            instructions = context.resources.getStringArray(R.array.tom_yum_goong_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 22,
            categoryOfFood = context.getString(R.string.soups),
            dishTitle = context.getString(R.string.tom_kha_talay),
            imageResId = R.drawable.tom_kha_talay_22_500,
            description =
            context.getString(R.string.tom_kha_talay_description),
            ingredients =
            context.resources.getStringArray(R.array.tom_kha_talay_ingredients),
            instructions = context.resources.getStringArray(R.array.tom_kha_talay_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 23,
            categoryOfFood = context.getString(R.string.soups),
            dishTitle = context.getString(R.string.gang_jued_woon_sen),
            imageResId = R.drawable.gang_jued_woon_sen_23,
            description = context.getString(R.string.gang_jued_woon_sen_description),
            ingredients =
            context.resources.getStringArray(R.array.gang_jued_woon_sen_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_jued_woon_sen_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 24,
            categoryOfFood = context.getString(R.string.soups),
            dishTitle = context.getString(R.string.tom_som),
            imageResId = R.drawable.tom_som_24,
            description = context.getString(R.string.tom_som_description),
            ingredients =
            context.resources.getStringArray(R.array.tom_som_ingredients),
            instructions =
            context.resources.getStringArray(R.array.tom_som_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 25,
            categoryOfFood = context.getString(R.string.soups),
            dishTitle = context.getString(R.string.gang_om),
            imageResId = R.drawable.gang_om_25_500,
            description = context.getString(R.string.gang_om_description),
            ingredients =
            context.resources.getStringArray(R.array.gang_om_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_om_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 26,
            categoryOfFood = context.getString(R.string.soups),
            dishTitle = context.getString(R.string.poh_taek),
            imageResId = R.drawable.poh_taek_26,
            description = context.getString(R.string.poh_taek_description),
            ingredients =
            context.resources.getStringArray(R.array.poh_taek_ingredients),
            instructions =
            context.resources.getStringArray(R.array.poh_taek_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 27,
            categoryOfFood = context.getString(R.string.soups),
            dishTitle = context.getString(R.string.gang_tay_po),
            imageResId = R.drawable.gang_tay_po_27,
            description = context.getString(R.string.gang_tay_po_description),
            ingredients =
            context.resources.getStringArray(R.array.gang_tay_po_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_tay_po_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 28,
            categoryOfFood = context.getString(R.string.soups),
            dishTitle = context.getString(R.string.kuay_tiew_tom_yum),
            imageResId = R.drawable.kuay_tiew_tom_yum_28_500,
            description = context.getString(R.string.kuay_tiew_tom_yum_description),
            ingredients =
            context.resources.getStringArray(R.array.kuay_tiew_tom_yum_ingredients),
            instructions =
            context.resources.getStringArray(R.array.kuay_tiew_tom_yum_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

       RecipeModel(
            recipeId = 29,
            categoryOfFood = context.getString(R.string.soups),
            dishTitle = context.getString(R.string.gang_som),
            imageResId = R.drawable.gang_som_29,
            description = context.getString(R.string.gang_som_description),
            ingredients =
            context.resources.getStringArray(R.array.gang_som_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_som_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeModel(
            recipeId = 31,
            categoryOfFood = context.getString(R.string.curries),
            dishTitle = context.getString(R.string.gang_keow_wan_gai),
            imageResId = R.drawable.gang_keow_wan_gai_31_500,
            description = context.getString(R.string.gang_keow_wan_gai_description),
            ingredients =
            context.resources.getStringArray(R.array.gang_keow_wan_gai_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_keow_wan_gai_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 32,
            categoryOfFood = context.getString(R.string.curries),
            dishTitle = context.getString(R.string.gang_massaman),
            imageResId = R.drawable.gang_massaman_32,
            description = context.getString(R.string.gang_massaman_description),
            ingredients =
            context.resources.getStringArray(R.array.gang_massaman_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_massaman_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 33,
            categoryOfFood = context.getString(R.string.curries),
            dishTitle = context.getString(R.string.gang_dang),
            imageResId = R.drawable.gang_dang_33,
            description = context.getString(R.string.gang_dang_description),
            ingredients =
            context.resources.getStringArray(R.array.gang_dang_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_dang_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 34,
            categoryOfFood = context.getString(R.string.curries),
            dishTitle = context.getString(R.string.gang_panang),
            imageResId = R.drawable.gang_panang_34_500,
            description = context.getString(R.string.gang_panang_description),
            ingredients =
            context.resources.getStringArray(R.array.gang_panang_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_panang_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 35,
            categoryOfFood = context.getString(R.string.curries),
            dishTitle = context.getString(R.string.gang_garee_gai),
            imageResId = R.drawable.gang_garee_gai_35_500,
            description = context.getString(R.string.gang_garee_gai_description),
            ingredients =
            context.resources.getStringArray(R.array.gang_garee_gai_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_garee_gai_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 36,
            categoryOfFood = context.getString(R.string.curries),
            dishTitle = context.getString(R.string.gung_ho),
            imageResId = R.drawable.gung_ho_36,
            description = context.getString(R.string.gung_ho_description),
            ingredients =
            context.resources.getStringArray(R.array.gung_ho_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gung_ho_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 37,
            categoryOfFood = context.getString(R.string.curries),
            dishTitle = context.getString(R.string.gang_ped_yang),
            imageResId = R.drawable.gang_ped_yang_37_500,
            description = context.getString(R.string.gang_ped_yang_description),
            ingredients =
            context.resources.getStringArray(R.array.gang_ped_yang_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_ped_yang_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 38,
            categoryOfFood = context.getString(R.string.curries),
            dishTitle = context.getString(R.string.gang_phet_pet_yang),
            imageResId = R.drawable.gang_phet_pet_yang_38,
            description = context.getString(R.string.gang_phet_pet_yang_description),
            ingredients =
            context.resources.getStringArray(R.array.gang_phet_pet_yang_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_phet_pet_yang_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 39,
            categoryOfFood = context.getString(R.string.curries),
            dishTitle = context.getString(R.string.gang_kiew_wan_talay),
            imageResId = R.drawable.gang_kiew_wan_talay_39,
            description = context.getString(R.string.gang_kiew_wan_talay_description),
            ingredients =
            context.resources.getStringArray(R.array.gang_kiew_wan_talay_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_kiew_wan_talay_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 40,
            categoryOfFood = context.getString(R.string.curries),
            dishTitle = context.getString(R.string.gang_som_pak_ruam),
            imageResId = R.drawable.gaeng_som_pak_ruam_40,
            description = context.getString(R.string.gang_som_pak_ruam_description),
            ingredients =
            context.resources.getStringArray(R.array.gang_som_pak_ruam_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_som_pak_ruam_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////


//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 42,
            categoryOfFood = context.getString(R.string.main_dishes),
            dishTitle = context.getString(R.string.pad_thai),
            imageResId = R.drawable.pad_thai_42_500,
            description = context.getString(R.string.pad_thai_description),
            ingredients =
            context.resources.getStringArray(R.array.pad_thai_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pad_thai_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 43,
            categoryOfFood = context.getString(R.string.main_dishes),
            dishTitle = context.getString(R.string.pad_see_ew),
            imageResId = R.drawable.pad_see_ew_43_500,
            description = context.getString(R.string.pad_see_ew_description),
            ingredients =
            context.resources.getStringArray(R.array.pad_see_ew_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pad_see_ew_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 44,
            categoryOfFood = context.getString(R.string.main_dishes),
            dishTitle = context.getString(R.string.pad_kee_mao),
            imageResId = R.drawable.pad_kee_mao_44,
            description = context.getString(R.string.pad_kee_mao_description),
            ingredients =
            context.resources.getStringArray(R.array.pad_kee_mao_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pad_kee_mao_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 45,
            categoryOfFood = context.getString(R.string.main_dishes),
            dishTitle = context.getString(R.string.pad_krapow_moo),
            imageResId = R.drawable.pad_krapow_moo__45,
            description = context.getString(R.string.pad_krapow_moo_description),
            ingredients =
            context.resources.getStringArray(R.array.pad_krapow_moo_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pad_krapow_moo_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 46,
            categoryOfFood = context.getString(R.string.main_dishes),
            dishTitle = context.getString(R.string.pad_priew_wan),
            imageResId = R.drawable.pad_priew_wan_46_500,
            description = context.getString(R.string.pad_priew_wan_description),
            ingredients =
            context.resources.getStringArray(R.array.pad_priew_wan_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pad_priew_wan_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 47,
            categoryOfFood = context.getString(R.string.main_dishes),
            dishTitle = context.getString(R.string.pla_pad_krapow),
            imageResId = R.drawable.pla_pad_krapow_47,
            description = context.getString(R.string.pla_pad_krapow_description),
            ingredients =
            context.resources.getStringArray(R.array.pla_pad_krapow_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pla_pad_krapow_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 48,
            categoryOfFood = context.getString(R.string.main_dishes),
            dishTitle =context.getString(R.string.goong_pad_nam_prik_pao),
            imageResId = R.drawable.goong_pad_nam_prik_pao_48,
            description = context.getString(R.string.goong_pad_nam_prik_pao_description),
            ingredients =
            context.resources.getStringArray(R.array.goong_pad_nam_prik_pao_ingredients),
            instructions =
            context.resources.getStringArray(R.array.goong_pad_nam_prik_pao_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 49,
            categoryOfFood = context.getString(R.string.main_dishes),
            dishTitle = context.getString(R.string.gai_pad_khing),
            imageResId = R.drawable.gai_pad_khing_49,
            description = context.getString(R.string.gai_pad_khing_description),
            ingredients =
            context.resources.getStringArray(R.array.gai_pad_khing_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gai_pad_khing_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 50,
            categoryOfFood = context.getString(R.string.main_dishes),
            dishTitle = context.getString(R.string.neua_pad_prik),
            imageResId = R.drawable.neua_pad_prik_50,
            description = context.getString(R.string.neua_pad_prik_description),
            ingredients =
            context.resources.getStringArray(R.array.neua_pad_prik_ingredients),
            instructions =
            context.resources.getStringArray(R.array.neua_pad_prik_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 51,
            categoryOfFood = context.getString(R.string.main_dishes),
            dishTitle = context.getString(R.string.pla_muk_pad_prik),
            imageResId = R.drawable.pla_muk_pad_prik_51,
            description = context.getString(R.string.pla_muk_pad_prik_description),
            ingredients =
            context.resources.getStringArray(R.array.pla_muk_pad_prik_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pla_muk_pad_prik_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 53,
            categoryOfFood = context.getString(R.string.noodles_and_rice),
            dishTitle = context.getString(R.string.khao_pad),
            imageResId = R.drawable.khao_pad_53,
            description = context.getString(R.string.khao_pad_description),
            ingredients =
            context.resources.getStringArray(R.array.khao_pad_ingredients),
            instructions =
            context.resources.getStringArray(R.array.khao_pad_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 54,
            categoryOfFood = context.getString(R.string.noodles_and_rice),
            dishTitle = context.getString(R.string.khao_pad_gai),
            imageResId = R.drawable.khao_pad_gai__54_500,
            description = context.getString(R.string.khao_pad_gai_description),
            ingredients =
            context.resources.getStringArray(R.array.khao_pad_gai_ingredients),
            instructions =
            context.resources.getStringArray(R.array.khao_pad_gai_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 55,
            categoryOfFood = context.getString(R.string.noodles_and_rice),
            dishTitle = context.getString(R.string.khao_pad_kung),
            imageResId = R.drawable.khao_pad_kung__55,
            description = context.getString(R.string.mhao_pad_kung_description),
            ingredients =
            context.resources.getStringArray(R.array.hao_pad_kung_ingredients),
            instructions =
            context.resources.getStringArray(R.array.hao_pad_kung_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 56,
            categoryOfFood = context.getString(R.string.noodles_and_rice),
            dishTitle = context.getString(R.string.khao_pad_sapparot),
            imageResId = R.drawable.khao_pad_sapparot__56,
            description = context.getString(R.string.khao_pad_sapparot_description),
            ingredients =
            context.resources.getStringArray(R.array.khao_pad_sapparot_ingredients),

            instructions =
            context.resources.getStringArray(R.array.hao_pad_kung_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 57,
            categoryOfFood = context.getString(R.string.noodles_and_rice),
            dishTitle = context.getString(R.string.khao_soi),
            imageResId = R.drawable.khao_soi_57,
            description = context.getString(R.string.khao_soi_description),
            ingredients =
            context.resources.getStringArray(R.array.khao_soi_ingredients),
            instructions =
            context.resources.getStringArray(R.array.khao_soi_ingredients)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 58,
            categoryOfFood = context.getString(R.string.noodles_and_rice),
            dishTitle = context.getString(R.string.kuay_tiew_nam_tok),
            imageResId = R.drawable.kuay_tiew_nam_tok__58,
            description = context.getString(R.string.kuay_tiew_nam_tok_description),
            ingredients =
            context.resources.getStringArray(R.array.kuay_tiew_nam_tok_ingredients),
            instructions =
            context.resources.getStringArray(R.array.kuay_tiew_nam_tok_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 59,
            categoryOfFood = context.getString(R.string.noodles_and_rice),
            dishTitle = context.getString(R.string.pad_woon_sen),
            imageResId = R.drawable.pad_woon_sen__59,
            description =
            context.getString(R.string.pad_woon_sen_description),
            ingredients =
            context.resources.getStringArray(R.array.pad_woon_sen_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pad_woon_sen_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 60,
            categoryOfFood = context.getString(R.string.noodles_and_rice),
            dishTitle = context.getString(R.string.pad_thai_goong),
            imageResId = R.drawable.pad_thai_goong__60,
            description = context.getString(R.string.pad_thai_goong_description),
            ingredients =
            context.resources.getStringArray(R.array.pad_thai_goong_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pad_thai_goong_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 61,
            categoryOfFood = context.getString(R.string.noodles_and_rice),
            dishTitle = context.getString(R.string.pad_thai_jay),
            imageResId = R.drawable.pad_thai_jay__61,
            description = context.getString(R.string.pad_thai_jay_description),
            ingredients =
            context.resources.getStringArray(R.array.pad_thai_jay_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pad_thai_jay_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 62,
            categoryOfFood = context.getString(R.string.noodles_and_rice),
            dishTitle = context.getString(R.string.kuay_tiew_reua),
            imageResId = R.drawable.kuay_tiew_reua_62_500,
            description =context.getString(R.string.kuay_tiew_reua_description),
            ingredients =
            context.resources.getStringArray(R.array.kuay_tiew_reua_ingredients),
            instructions =
            context.resources.getStringArray(R.array.kuay_tiew_reua_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 64,
            categoryOfFood = context.getString(R.string.salads),
            dishTitle = context.getString(R.string.pla_goong),
            imageResId = R.drawable.pla_goong_64,
            description =
            context.getString(R.string.pla_goong_description),
            ingredients =
            context.resources.getStringArray(R.array.pla_goong_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pla_goong_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 65,
            categoryOfFood = context.getString(R.string.salads),
            dishTitle = context.getString(R.string.larb_gai),
            imageResId = R.drawable.larb_gai_65,
            description =
            context.getString(R.string.larb_gai_description),
            ingredients =
            context.resources.getStringArray(R.array.larb_gai_ingredients),
            instructions =
            context.resources.getStringArray(R.array.larb_gai_ingredients)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 66,
            categoryOfFood = context.getString(R.string.salads),
            dishTitle = context.getString(R.string.som_tum_thai),
            imageResId = R.drawable.som_tum_thai_66_500,
            description =
            context.getString(R.string.som_tum_thai_description),
            ingredients =
            context.resources.getStringArray(R.array.som_tum_thai_ingredients),
            instructions =
            context.resources.getStringArray(R.array.som_tum_thai_ingredients)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 67,
            categoryOfFood = context.getString(R.string.salads),
            dishTitle = context.getString(R.string.yum_talay),
            imageResId = R.drawable.yum_talay_67_500,
            description =
            context.getString(R.string.yum_talay_description),
            ingredients =
            context.resources.getStringArray(R.array.yum_talay_ingredients),
            instructions =
            context.resources.getStringArray(R.array.yum_talay_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 68,
            categoryOfFood = context.getString(R.string.salads),
            dishTitle = context.getString(R.string.yum_neua),
            imageResId = R.drawable.yum_neua_68,
            description =
            context.getString(R.string.yum_neua_description),
            ingredients =
            context.resources.getStringArray(R.array.myum_neua_ingredients),
            instructions =
            context.resources.getStringArray(R.array.yum_neua_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 69,
            categoryOfFood = context.getString(R.string.salads),
            dishTitle = context.getString(R.string.nam_sod),
            imageResId = R.drawable.nam_sod_69,
            description =
            context.getString(R.string.nam_sod_description),
            ingredients =
            context.resources.getStringArray(R.array.nam_sod_ingredients),
            instructions =
            context.resources.getStringArray(R.array.nam_sod_instructions),

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 70,
            categoryOfFood = context.getString(R.string.salads),
            dishTitle = context.getString(R.string.larb_moo),
            imageResId = R.drawable.larb_moo_70,
            description = context.getString(R.string.larb_moo_description),
            ingredients =
            context.resources.getStringArray(R.array.larb_moo_ingredients),
            instructions =
            context.resources.getStringArray(R.array.larb_moo_ingredients),

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 71,
            categoryOfFood = context.getString(R.string.salads),
            dishTitle = context.getString(R.string.yum_woon_sen),
            imageResId = R.drawable.yum_woon_sen_71,
            description =  context.getString(R.string.yum_woon_sen_description),
            ingredients =
            context.resources.getStringArray(R.array.myum_woon_sen_ingredients),
            instructions =
            context.resources.getStringArray(R.array.yum_woon_sen_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 72,
            categoryOfFood = context.getString(R.string.salads),
            dishTitle = context.getString(R.string.yum_mamuang),
            imageResId = R.drawable.yum_mamuang_72_500,
            description =
            context.getString(R.string.yum_mamuang_description),

            ingredients =
            context.resources.getStringArray(R.array.yum_mamuang_ingredients),
            instructions =
            context.resources.getStringArray(R.array.yum_mamuang_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 73,
            categoryOfFood = context.getString(R.string.salads),
            dishTitle = context.getString(R.string.yum_pla_duk_foo),
            imageResId = R.drawable.yum_pla_duk_foo_73_500,
            description =
            context.getString(R.string.yum_pla_duk_foo_description),
            ingredients =
            context.resources.getStringArray(R.array.yum_pla_duk_foo_ingredients),
            instructions =
            context.resources.getStringArray(R.array.yum_pla_duk_foo_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////


//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 75,
            categoryOfFood = context.getString(R.string.seafood_dishes),
            dishTitle = context.getString(R.string.pla_rad_prik),
            imageResId = R.drawable.pla_rad_prik_75,
            description = context.getString(R.string.pla_rad_prik_description),
            ingredients =
            context.resources.getStringArray(R.array.pla_rad_prik_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pla_rad_prik_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 76,
            categoryOfFood = context.getString(R.string.seafood_dishes),
            dishTitle = context.getString(R.string.pla_nueng_manao),
            imageResId = R.drawable.pla_nueng_manao_76_500,
            description = context.getString(R.string.pla_nueng_manao_description),
            ingredients =
            context.resources.getStringArray(R.array.pla_nueng_manao_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pla_nueng_manao_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 77,
            categoryOfFood = context.getString(R.string.seafood_dishes),
            dishTitle = context.getString(R.string.goong_phat_prik),
            imageResId = R.drawable.goong_phat_prik_77_500,
            description =
            context.getString(R.string.goong_phat_prik_description),
            ingredients =
            context.resources.getStringArray(R.array.mgoong_phat_prik_ingredients),
            instructions =
            context.resources.getStringArray(R.array.goong_phat_prik_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 78,
            categoryOfFood = context.getString(R.string.seafood_dishes),
            dishTitle = context.getString(R.string.goong_phat_khing),
            imageResId = R.drawable.goong_phat_khing_78_500,
            description =
            context.getString(R.string.goong_phat_khing_description),
            ingredients =
            context.resources.getStringArray(R.array.goong_phat_khing_ingredients),
            instructions =
            context.resources.getStringArray(R.array.goong_phat_khing_instructions),

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 79,
            categoryOfFood = context.getString(R.string.seafood_dishes),
            dishTitle = context.getString(R.string.pla_krapong_neung_manao),
            imageResId = R.drawable.pla_krapong_neung_manao_79_500,
            description = context.getString(R.string.pla_krapong_neung_manao_description),
            ingredients =
            context.resources.getStringArray(R.array.pla_krapong_neung_manao_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pla_krapong_neung_manao_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 80,
            categoryOfFood = context.getString(R.string.seafood_dishes),
            dishTitle = context.getString(R.string.pla_tod_kamin),
            imageResId = R.drawable.pla_tod_kamin_80,
            description = context.getString(R.string.pla_tod_kamin_description),
            ingredients =
            context.resources.getStringArray(R.array.pla_tod_kamin_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pla_tod_kamin_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 81,
            categoryOfFood = context.getString(R.string.seafood_dishes),
            dishTitle = context.getString(R.string.goong_phat_phrik_pow),
            imageResId = R.drawable.goong_phat_phrik_pow_81,
            description = context.getString(R.string.goong_phat_phrik_pow_description),
            ingredients =
            context.resources.getStringArray(R.array.goong_phat_phrik_pow_ingredients),
            instructions =
            context.resources.getStringArray(R.array.goong_phat_phrik_pow_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 82,
            categoryOfFood = context.getString(R.string.seafood_dishes),
            dishTitle = context.getString(R.string.pla_neung_si_ew),
            imageResId = R.drawable.pla_neung_si_ew_82,
            description = context.getString(R.string.pla_neung_si_ew_description),
            ingredients =
            context.resources.getStringArray(R.array.pla_neung_si_ew_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pla_neung_si_ew_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 83,
            categoryOfFood = context.getString(R.string.seafood_dishes),
            dishTitle = context.getString(R.string.pad_cha_talay),
            imageResId = R.drawable.pad_cha_talay_83_500,
            description = context.getString(R.string.pad_cha_talay_description),
            ingredients =
            context.resources.getStringArray(R.array.pad_cha_talay_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pad_cha_talay_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 84,
            categoryOfFood = context.getString(R.string.seafood_dishes),
            dishTitle = context.getString(R.string.goong_phat_khao_poht),
            imageResId = R.drawable.goong_phat_khao_poht_84_500,
            description =
            context.getString(R.string.goong_phat_khao_poht_description),
            ingredients =
            context.resources.getStringArray(R.array.goong_phat_khao_poht_ingredients),
            instructions =
            context.resources.getStringArray(R.array.goong_phat_khao_poht_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 86,
            categoryOfFood = context.getString(R.string.vegetarian_dishes),
            dishTitle = context.getString(R.string.pad_pak_ruam_mit),
            imageResId = R.drawable.pad_pak_ruam_mit_86_500,
            description =
            context.getString(R.string.pad_pak_ruam_mit_description),
            ingredients =
            context.resources.getStringArray(R.array.pad_pak_ruam_mit_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pad_pak_ruam_mit_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 87,
            categoryOfFood = context.getString(R.string.vegetarian_dishes),
            dishTitle = context.getString(R.string.kai_lan_phat_thai),
            imageResId = R.drawable.kai_lan_phat_thai_87,
            description =
            context.getString(R.string.kai_lan_phat_thai_description),
            ingredients =
            context.resources.getStringArray(R.array.kai_lan_phat_thai_ingredients),
            instructions =
            context.resources.getStringArray(R.array.kai_lan_phat_thai_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 88,
            categoryOfFood = context.getString(R.string.vegetarian_dishes),
            dishTitle = context.getString(R.string.phak_boong_fai_daeng),
            imageResId = R.drawable.phak_boong_fai_daeng_88_500,
            description =
            context.getString(R.string.phak_boong_fai_daeng_description),
            ingredients =
            context.resources.getStringArray(R.array.phak_boong_fai_daeng_ingredients),
            instructions =
            context.resources.getStringArray(R.array.phak_boong_fai_daeng_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 89,
            categoryOfFood = context.getString(R.string.vegetarian_dishes),
            dishTitle = context.getString(R.string.phad_phak_kana),
            imageResId = R.drawable.phad_phak_kana_89,
            description =
            context.getString(R.string.phad_phak_kana_description),
            ingredients =
            context.resources.getStringArray(R.array.phad_phak_kana_ingredients),
            instructions =
            context.resources.getStringArray(R.array.phad_phak_kana_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 90,
            categoryOfFood = context.getString(R.string.vegetarian_dishes),
            dishTitle = context.getString(R.string.pad_pak),
            imageResId = R.drawable.pad_pak_90_500,
            description =  context.getString(R.string.pad_pak_description),
            ingredients =
            context.resources.getStringArray(R.array.pad_pak_ingredients),
            instructions =
            context.resources.getStringArray(R.array.pad_pak_instructions),
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 91,
            categoryOfFood = context.getString(R.string.vegetarian_dishes),
            dishTitle = context.getString(R.string.gang_keow_wan_pak),
            imageResId = R.drawable.gang_keow_wan_pak_91_700,
            description =
            context.getString(R.string.gang_keow_wan_pak),
            ingredients =
            context.resources.getStringArray(R.array.gang_keow_wan_pak_ingredients),
            instructions =
            context.resources.getStringArray(R.array.gang_keow_wan_pak_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 92,
            categoryOfFood = context.getString(R.string.vegetarian_dishes),
            dishTitle = context.getString(R.string.som_tum_thai_jay),
            imageResId = R.drawable.som_tum_thai_jay_92_500,
            description = context.getString(R.string.som_tum_thai_jay_description),
            ingredients =
            context.resources.getStringArray(R.array.som_tum_thai_jay_ingredients),
            instructions =
            context.resources.getStringArray(R.array.som_tum_thai_jay_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 94,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.luk_chup),
            imageResId = R.drawable.luk_chup_94,
            description =
            context.getString(R.string.luk_chup_description),

            ingredients =
            context.resources.getStringArray(R.array.luk_chup_ingredients),
            instructions =
            context.resources.getStringArray(R.array.luk_chup_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 95,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.tub_tim_grob),
            imageResId = R.drawable.tub_tim_grob_95,
            description =
            context.getString(R.string.tub_tim_grob_description),
            ingredients =
            context.resources.getStringArray(R.array.tub_tim_grob_ingredients),
            instructions =
            context.resources.getStringArray(R.array.tub_tim_grob_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 96,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.ruam_mit),
            imageResId = R.drawable.ruam_mit_96_500,
            description = context.getString(R.string.ruam_mit_description),
            ingredients =
            context.resources.getStringArray(R.array.ruam_mit_ingredients),
            instructions =
            context.resources.getStringArray(R.array.ruam_mit_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 97,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.kluay_buat_chi),
            imageResId = R.drawable.kluay_buat_chi_97_500,
            description =
            context.getString(R.string.kluay_buat_chi_description),
            ingredients =
            context.resources.getStringArray(R.array.kluay_buat_chi_ingredients),
            instructions =
            context.resources.getStringArray(R.array.kluay_buat_chi_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 98,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.sang_kaya_fug_thong),
            imageResId = R.drawable.sang_kaya_fug_thong_98,
            description =
            context.getString(R.string.sang_kaya_fug_thong_description),
            ingredients =
            context.resources.getStringArray(R.array.sang_kaya_fug_thong_ingredients),
            instructions =
            context.resources.getStringArray(R.array.sang_kaya_fug_thong_ingredients)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 99,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.tao_suan),
            imageResId = R.drawable.tao_suan_99_500,
            description =
            context.getString(R.string.tao_suan_description),
            ingredients =
            context.resources.getStringArray(R.array.tao_suan_ingredients),
            instructions =
            context.resources.getStringArray(R.array.tao_suan_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 100,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.kanom_krok),
            imageResId = R.drawable.kanom_krok_100,
            description =
            context.getString(R.string.kanom_krok_description),
            ingredients =
            context.resources.getStringArray(R.array.kanom_krok_ingredients),
            instructions =
            context.resources.getStringArray(R.array.kanom_krok_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 101,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.kluay_tod),
            imageResId = R.drawable.kluay_tod_101,
            description = context.getString(R.string.kluay_tod_description),
            ingredients =
            context.resources.getStringArray(R.array.kluay_tod_ingredients),
            instructions =
            context.resources.getStringArray(R.array.kluay_tod_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 102,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle =  context.getString(R.string.sa_koo),
            imageResId = R.drawable.sa_koo_102,
            description =
            context.getString(R.string.sa_koo_description),
            ingredients =
            context.resources.getStringArray(R.array.sa_koo_ingredients),

            instructions =
            context.resources.getStringArray(R.array.sa_koo_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 103,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.thai_coconut_pancakes),
            imageResId = R.drawable.thai_coconut_pancakes_103,
            description =
            context.getString(R.string.thai_coconut_pancakes_description),
            ingredients =
            context.resources.getStringArray(R.array.thai_coconut_pancakes_ingredients),
            instructions =
            context.resources.getStringArray(R.array.thai_coconut_pancakes_instructions),

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 104,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.black_sticky_rice_pudding),
            imageResId = R.drawable.black_sticky_rice_pudding_104_500,
            description =
            context.getString(R.string.black_sticky_rice_pudding_description),
            ingredients =
            context.resources.getStringArray(R.array.black_sticky_rice_pudding_ingredients),
            instructions =
            context.resources.getStringArray(R.array.black_sticky_rice_pudding_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 105,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.khanom_chan),
            imageResId = R.drawable.khanom_chan_105_500,
            description =
            context.getString(R.string.khanom_chan_description),
            ingredients =
            context.resources.getStringArray(R.array.khanom_chan_ingredients),

            instructions =
            context.resources.getStringArray(R.array.khanom_chan_instructions),

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 106,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.khanom_tuay),
            imageResId = R.drawable.khanom_tuay_106,
            description = context.getString(R.string.khanom_tuay_description),
            ingredients =
            context.resources.getStringArray(R.array.khanom_tuay_ingredients),
            instructions =
            context.resources.getStringArray(R.array.khanom_tuay_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 107,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.tako),
            imageResId = R.drawable.tako_107_500,
            description = context.getString(R.string.tako_description),
            ingredients =
            context.resources.getStringArray(R.array.tako_ingredients),
            instructions =
            context.resources.getStringArray(R.array.tako_instructions)
        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeModel(
            recipeId = 108,
            categoryOfFood = context.getString(R.string.desserts),
            dishTitle = context.getString(R.string.khao_tom_mat),
            imageResId = R.drawable.khao_tom_mat_108_ed,
            description = context.getString(R.string.khao_tom_mat_description),
            ingredients =
            context.resources.getStringArray(R.array.khao_tom_mat_ingredients),
            instructions =
            context.resources.getStringArray(R.array.khao_tom_mat_instructions)

        ),
//////////////////////////////////////////////////////////////////////////////////////////////////////


    )
}






