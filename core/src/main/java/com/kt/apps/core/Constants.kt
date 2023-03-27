package com.kt.apps.core

object Constants {
    const val SHARE_PREF_NAME = "extra:default_share_pref_name"
    const val SHARE_PREF_DEFAULT = "extra:default_share_pref"

    const val USER_AGENT: String = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) " +
            "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36"

    const val KEY_ACCESS_TOKEN = "key:access_token"

    const val URL = "https://binhluan.90phut6.live/"

    const val DEEPLINK_HOST = "xemtivihd.net"

    const val HOST_TV = "tv"
    const val HOST_FOOTBALL = "bongda"
    const val HOST_RADIO = "radio"
    const val SCHEME_DEFAULT = "xemtv"

    const val EXTRA_PLAYBACK_TYPE = "extra:playback_type"
    const val EXTRA_FOOTBALL_MATCH = "extra:football_match"
    const val EXTRA_TV_CHANNEL = "extra:tv_channel"

    val mapChannel: Map<String, String> by lazy {
        mapOf(
            "ABC Australia" to "icon_channel_australia_plus_16564921977.png",
            "An Giang" to "icon_channel_an_giang_165655813369.png",
            "An Ninh TV HD" to "icon_channel_antv_165655612485.png",
            "Asian Food Network" to "icon_channel_asian_food_channel_1656492213422.png",
            "Bà Rịa Vũng Tàu" to "icon_channel_ba_ria_vung_tau_165655617345.png",
            "Bắc Giang HD" to "icon_channel_bac_giang_165655615343.png",
            "Bắc Kạn" to "icon_channel_bac_kan_165655814567.png",
            "Bạc Liêu" to "icon_channel_bac_lieu_16565581548.png",
            "Bắc Ninh" to "icon_channel_bac_ninh_16565581667.png",
            "Bến Tre" to "icon_channel_ben_tre_166518804636.png",
            "Bình Định" to "icon_channel_binh_dinh_165655818203.png",
            "Bình Dương 1" to "icon_channel_binh_duong_1_165655622878.png",
            "Bình Dương 11" to "icon_channel_btv_11_1656556391452.png",
            "Bình Dương 2" to "icon_channel_binh_duong_2_165655623765.png",
            "" to "icon_channel_binh_duong_3_16565562536.png",
            "Bình Dương 4 HD" to "icon_channel_imovie_hd_165656515084.png",
            "Bình Dương 6" to "icon_channel_btv6_1656556375172.png",
            "" to "icon_channel_btv9_1656556384082.png",
            "Bình Phước 1" to "icon_channel_binh_phuoc_1_165655621391.png",
            "Bình Phước 2" to "icon_channel_hometv_bptv2_165655622154.png",
            "Bình Thuận" to "icon_channel_binh_thuan_165647570229.png",
            "Cà Mau" to "icon_channel_ca_mau_165655821089.png",
            "Cần Thơ" to "icon_channel_can_tho_165655892661.png",
            "" to "icon_channel_cao_bang_165647577645.png",
            "Channel News Asia HD" to "icon_channel_channel_newsasia_1656492950912.png",
            "Đà Nẵng 1" to "icon_channel_da_nang_1_1656492987662.png",
            "Đà Nẵng 2" to "icon_channel_da_nang_2_1656492995882.png",
            "Da Vinci" to "icon_channel_da_vinci_learning_1656556593842.png",
            "Đắk Lắk" to "icon_channel_dak_lak_165655700424.png",
            "Điện Biên" to "icon_channel_dien_bien_1656558226232.png",
            "Đồng Nai 1 HD" to "icon_channel_dong_nai_1_1656475806362.png",
            "Đồng Nai 2" to "icon_channel_dong_nai_2_1656475819582.png",
            "Đồng Tháp 1" to "icon_channel_dong_thap_165655753932.png",
            "Đồng Tháp 2" to "icon_channel_mien_tay_thdt2_1656669937382.png",
            "DW HD" to "icon_channel_dw_1656492345412.png",
            "France 24 English HD" to "icon_channel_france_24_1656493080452.png",
            "Gia Lai" to "icon_channel_gia_lai_1656558891032.png",
            "Hà Giang" to "icon_channel_ha_giang_165647603612.png",
            "Hà Nam" to "icon_channel_ha_nam_165655890147.png",
            "Hà Nội 1" to "icon_channel_hanoitv_1_1656492381672.png",
            "Hà Tĩnh" to "icon_channel_ha_tinh_1656558262372.png",
            "" to "icon_channel_hai_duong_165649258755.png",
            "" to "icon_channel_hai_phong_1656558914732.png",
            "Hậu Giang" to "icon_channel_hau_giang_165655824967.png",
            "Hòa Bình" to "icon_channel_hoa_binh_1656557056552.png",
            "" to "icon_channel_hung_yen_1656493166922.png",
            "HTV Key" to "icon_channel_htv4_1656476700552.png",
            "HTV Thể Thao HD" to "icon_channel_htvc_the_thao_1656493154832.png",
            "HTV1" to "icon_channel_htv1_1656557069452.png",
            "HTV2 HD" to "icon_channel_htv2_165657612334.png",
            "HTV3" to "icon_channel_htv3_1656558279912.png",
            "HTV7 HD" to "icon_channel_htv7_hd_16565582880.png",
            "HTV9 HD" to "icon_channel_htv9_hd_165655829886.png",
            "HTVC Ca Nhạc HD" to "icon_channel_htvc_ca_nhac_1656493098162.png",
            "HTVC Du lịch Cuộc sống HD" to "icon_channel_htvc_du_lich_1656493038942.png",
            "HTVC Gia Đình HD" to "icon_channel_htvc_gia_dinh_1656493090842.png",
            "HTVC Mua sắm tiêu dùng" to "icon_channel_htvc_shopping_1656493140532.png",
            "HTVC Phim HD" to "icon_channel_htvc_phim_1656493107552.png",
            "HTVC Phụ Nữ HD" to "icon_channel_htvc_phu_nu_1656493249982.png",
            "HTVC Thuần Việt" to "icon_channel_htvc_thuan_viet_sd_165647865582.png",
            "HTVC Thuần Việt HD" to "icon_channel_htvc_thuan_viet_hd_1656478671262.png",
            "HTVC+ HD" to "icon_channel_htvc_plus_1656576133242.png",
            "KBS World HD" to "icon_channel_kbs_world_1656557264112.png",
            "Khánh Hòa" to "icon_channel_khanh_hoa_1656558313512.png",
            "" to "icon_channel_kien_giang_1656493176112.png",
            "Kix" to "icon_channel_kix_165649318532.png",
            "Kon Tum" to "icon_channel_kon_tum_1656558326972.png",
            "" to "icon_channel_lai_chau_1656492452792.png",
            "Lâm Đồng" to "icon_channel_lam_dong_1656492399292.png",
            "Lạng Sơn" to "icon_channel_lang_son_1656585276672.png",
            "" to "icon_channel_lao_cai_1656558347952.png",
            "Long An" to "icon_channel_long_an_1656558338422.png",
            "Nam Định" to "icon_channel_nam_dinh_1656557300672.png",
            "Nghệ An" to "icon_channel_nghe_an_1656493226672.png",
            "Nhân Dân TV HD" to "icon_channel_truyen_hinh_nhan_dan_165655731781.png",
            "NHK World" to "icon_channel_nhk_world_hd_1656557328232.png",
            "Ninh Bình" to "icon_channel_ninh_binh_165649260222.png",
            "Ninh Thuận" to "icon_channel_ninh_thuan_1656557352692.png",
            "Outdoor Channel" to "icon_channel_outdoor_channel_1656493235452.png",
            "" to "icon_channel_phu_tho_1656557477612.png",
            "" to "icon_channel_phu_yen_1656558593762.png",
            "Quảng Bình" to "icon_channel_quang_binh_tv_1656558608352.png",
            "Quảng Nam" to "icon_channel_quang_nam_1656492517622.png",
            "Quảng Ngãi" to "icon_channel_quang_ngai_165655742091.png",
            "Quảng Ninh 1" to "icon_channel_quang_ninh_1_165655862222.png",
            "Quảng Ninh 3" to "icon_channel_quang_ninh_3_1656560399132.png",
            "Quảng Trị" to "icon_channel_quang_tri_1656478574822.png",
            "Quốc Hội HD" to "icon_channel_quoc_hoi_hd_165656647452.png",
            "Quốc Phòng HD" to "icon_channel_quoc_phong_vn_165647856201.png",
            "" to "icon_channel_son_la_1656558857352.png",
            "Sóc Trăng" to "icon_channel_soc_trang_165656082452.png",
            "Tây Ninh HD" to "icon_channel_tay_ninh_hd_1656478594032.png",
            "TH Thông Tấn HD" to "icon_channel_thong_tan_xa_viet_nam_165649329873.png",
            "Thái Bình" to "icon_channel_thai_binh_1656478612362.png",
            "Thái Nguyên" to "icon_channel_thai_nguyen_1656557523932.png",
            "Thanh Hóa" to "icon_channel_thanh_hoa_1656570355912.png",
            "Thừa Thiên Huế" to "icon_channel_thua_thien_hue_1656558944262.png",
            "Tiền Giang" to "icon_channel_tien_giang_1656557556552.png",
            "Trà Vinh" to "icon_channel_tra_vinh_1656557568522.png",
            "Tuyên Quang" to "icon_channel_tuyen_quang_1656560417792.png",
            "Vĩnh Long 1 HD" to "icon_channel_thvl1_165657384745.png",
            "Vĩnh Long 2 HD" to "icon_channel_vinh_long_2_1656573856152.png",
            "Vĩnh Long 3 HD" to "icon_channel_vinh_long_3_1656573863882.png",
            "Vĩnh Long 4 HD" to "icon_channel_vinh_long_4_hd_1656573877542.png",
            "Vĩnh Phúc" to "icon_channel_vinh_phuc_1656492619662.png",
            "VTC1 HD" to "icon_channel_vtc1_1656493309872.png",
            "VTC10" to "icon_channel_vtc10_166706321017.jpg",
            "VTC11" to "icon_channel_vtc11_thieu_nhi_1656494361482.png",
            "VTC12" to "icon_channel_vtc12_165649436922.png",
            "VTC13 HD" to "icon_channel_vtc13_hd_1656493465022.png",
            "VTC14 HD" to "icon_channel_vtc14_hd_1656493581722.png",
            "VTC16 HD" to "icon_channel_vtc16_1656493594572.png",
            "VTC2" to "icon_channel_vtc2_1656493319822.png",
            "VTC3 HD" to "icon_channel_vtc3_hd_1656493328642.png",
            "VTC4 HD" to "icon_channel_yeah1_family_vtc4_1656496937772.png",
            "VTC5 HD" to "icon_channel_vtc5_1656496946342.png",
            "VTC6" to "icon_channel_vtc6_1656494338272.png",
            "VTC7 HD" to "icon_channel_todaytv_vtc7_1656496956272.png",
            "VTC8" to "icon_channel_vtc8_1656494345432.png",
            "VTC9 HD" to "icon_channel_vtc9_1656493473382.png",
            "VTV Cần Thơ" to "icon_channel_vtv_can_tho_166537074507.jpg",
            "VTV1 HD" to "icon_channel_vtv1_hd_165657381026.png",
            "VTV2 HD" to "icon_channel_vtv2_hd_16565576783.png",
            "VTV3 HD" to "icon_channel_vtv3_hd_165657381668.png",
            "VTV4 HD" to "icon_channel_vtv4_hd_165657382285.png",
            "VTV5 HD" to "icon_channel_vtv5_hd_165657382858.png",
            "VTV7 HD" to "icon_channel_vtv7_hd_165655773646.png",
            "VTV8 HD" to "icon_channel_vtv8_hd_165657496167.png",
            "VTV9 HD" to "icon_channel_vtv9_hd_165657032671.png",
            "Yên Bái" to "icon_channel_yen_bai_1656559097542.png",
            "VOV Fm89" to "icon_channel_vov_suckhoe.png",
            "VOV giao thông Hà Nội" to "icon_channel_vov_giaothong.png",
            "VOV giao thông HCM" to "icon_channel_vov_giaothong.png",
            "VOV Mekong" to "icon_channel_vov_mekong.png",
            "VOV1" to "icon_channel_vov1.png",
            "VOV2" to "icon_channel_vov2.png",
            "VOV3" to "icon_channel_vov3.png",
            "VOV4 Đồng bằng sông Cửu Long" to "icon_channel_vov_dbscl.png",
            "VOV4 Hồ Chí Minh" to "icon_channel_vov_hcm.png",
            "VOV4 Miền Trung" to "icon_channel_vov_mientrung.png",
            "VOV4 Tây Bắc" to "icon_channel_vov_taybac.png",
            "VOV4 Tây Nguyên" to "icon_channel_vov_taynguyen.png",
            "VOV5" to "icon_channel_vov5.png",
            "VOV5-chinese" to "icon_channel_vov5.png",
            "VOV5 English 247" to "icon_channel_vov5.png",
            "VOV5-french" to "icon_channel_vov5.png",
            "VOV5-german" to "icon_channel_vov5.png",
            "VOV5-indonesian" to "icon_channel_vov5.png",
            "VOV5-japanese" to "icon_channel_vov5.png",
            "VOV5-khmer" to "icon_channel_vov5.png",
            "VOV5-laotian" to "icon_channel_vov5.png",
            "VOV5-russian" to "icon_channel_vov5.png",
            "VOV5-spanish" to "icon_channel_vov5.png",
            "VOV5-thailand" to "icon_channel_vov5.png",
            "VOV6 international Svc" to "icon_channel_vov6.png",
            "Fm 87.7Mhz" to "icon_channel_voh.png",
            "Fm 95.6Mhz" to "icon_channel_voh.png",
            "FM 99.9Mhz" to "icon_channel_voh.png",
            "AM 610khz" to "icon_channel_voh.png",
            "Hà Nội 1" to "icon_channel_hanoi1.png",
            "Hà Nội 2" to "icon_channel_hanoi2.png",
            "Đồng Nai 1 HD" to "icon_channel_dongnai1.png",
            "Đồng Nai 2" to "icon_channel_dongnai2.png",
            "Đồng Nai 3" to "icon_channel_dongnai3.png",
            "Đắk Nông" to "icon_channel_daknong.png",
            "An Viên HD" to "icon_channel_anvien.png",
            "HTV Co.op" to "icon_channel_htv_coop.png",
        )
    }
}