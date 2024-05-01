package com.example.wallpaper.data.model.detail


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class ResponseDetail(
    @SerializedName("alt_description")
    val altDescription: String?, // a room with a sign that says you'll think of something
    @SerializedName("alternative_slugs")
    val alternativeSlugs: @RawValue AlternativeSlugs?,
    @SerializedName("asset_type")
    val assetType: String?, // photo
    @SerializedName("blur_hash")
    val blurHash: String?, // LEF5~o-T4nD%~qIUt6t74TIoog%M
    @SerializedName("breadcrumbs")
    val breadcrumbs: @RawValue List<Any?>?,
    @SerializedName("color")
    val color: String?, // #262626
    @SerializedName("created_at")
    val createdAt: String?, // 2024-04-09T21:34:10Z
    @SerializedName("current_user_collections")
    val currentUserCollections: @RawValue List<Any?>?,
    @SerializedName("description")
    val description: @RawValue Any?, // null
    @SerializedName("downloads")
    val downloads: Int?, // 2970
    @SerializedName("exif")
    val exif: @RawValue Exif?,
    @SerializedName("height")
    val height: Int?, // 3601
    @SerializedName("id")
    val id: String?, // CSQEIr0eOZI
    @SerializedName("liked_by_user")
    val likedByUser: Boolean?, // false
    @SerializedName("likes")
    val likes: Int?, // 118
    @SerializedName("links")
    val links: @RawValue Links?,
    @SerializedName("location")
    val location: @RawValue Location?,
    @SerializedName("meta")
    val meta: @RawValue Meta?,
    @SerializedName("promoted_at")
    val promotedAt: String?, // 2024-04-11T09:20:10Z
    @SerializedName("public_domain")
    val publicDomain: Boolean?, // false
    @SerializedName("related_collections")
    val relatedCollections: @RawValue RelatedCollections?,
    @SerializedName("slug")
    val slug: String?, // a-room-with-a-sign-that-says-youll-think-of-something-CSQEIr0eOZI
    @SerializedName("sponsorship")
    val sponsorship: @RawValue Any?, // null
    @SerializedName("tags")
    val tags: @RawValue List<Tag?>?,
    @SerializedName("tags_preview")
    val tagsPreview: @RawValue List<TagsPreview?>?,
    @SerializedName("topic_submissions")
    val topicSubmissions: @RawValue TopicSubmissions?,
    @SerializedName("topics")
    val topics: @RawValue List<Any?>?,
    @SerializedName("updated_at")
    val updatedAt: String?, // 2024-04-12T08:41:01Z
    @SerializedName("urls")
    val urls: @RawValue Urls?,
    @SerializedName("user")
    val user: @RawValue User?,
    @SerializedName("views")
    val views: Int?, // 458946
    @SerializedName("width")
    val width: Int? // 2701
)  : Parcelable {
    data class AlternativeSlugs(
        @SerializedName("de")
        val de: String?, // ein-zimmer-mit-einem-schild-auf-dem-steht-dass-dir-etwas-einfallt-CSQEIr0eOZI
        @SerializedName("en")
        val en: String?, // a-room-with-a-sign-that-says-youll-think-of-something-CSQEIr0eOZI
        @SerializedName("es")
        val es: String?, // una-habitacion-con-un-letrero-que-dice-que-pensaras-en-algo-CSQEIr0eOZI
        @SerializedName("fr")
        val fr: String?, // une-piece-avec-un-panneau-qui-dit-que-vous-allez-penser-a-quelque-chose-CSQEIr0eOZI
        @SerializedName("it")
        val `it`: String?, // una-stanza-con-un-cartello-che-dice-che-penserai-a-qualcosa-CSQEIr0eOZI
        @SerializedName("ja")
        val ja: String?, // 何かを思いつくという看板のある部屋-CSQEIr0eOZI
        @SerializedName("ko")
        val ko: String?, // 뭔가를-생각하게-될-것이라는-표지판이-있는-방-CSQEIr0eOZI
        @SerializedName("pt")
        val pt: String? // uma-sala-com-uma-placa-que-diz-que-voce-vai-pensar-em-algo-CSQEIr0eOZI
    )

    data class Exif(
        @SerializedName("aperture")
        val aperture: String?, // 1.5
        @SerializedName("exposure_time")
        val exposureTime: String?, // 1/383
        @SerializedName("focal_length")
        val focalLength: String?, // 5.7
        @SerializedName("iso")
        val iso: Int?, // 50
        @SerializedName("make")
        val make: String?, // Apple
        @SerializedName("model")
        val model: String?, // iPhone 13 Pro
        @SerializedName("name")
        val name: String? // Apple, iPhone 13 Pro
    )

    data class Links(
        @SerializedName("download")
        val download: String?, // https://unsplash.com/photos/CSQEIr0eOZI/download?ixid=M3w1NzA4MjR8MHwxfGFsbHx8fHx8fHx8fDE3MTI5MTQxMDV8
        @SerializedName("download_location")
        val downloadLocation: String?, // https://api.unsplash.com/photos/CSQEIr0eOZI/download?ixid=M3w1NzA4MjR8MHwxfGFsbHx8fHx8fHx8fDE3MTI5MTQxMDV8
        @SerializedName("html")
        val html: String?, // https://unsplash.com/photos/a-room-with-a-sign-that-says-youll-think-of-something-CSQEIr0eOZI
        @SerializedName("self")
        val self: String? // https://api.unsplash.com/photos/a-room-with-a-sign-that-says-youll-think-of-something-CSQEIr0eOZI
    )

    data class Location(
        @SerializedName("city")
        val city: Any?, // null
        @SerializedName("country")
        val country: Any?, // null
        @SerializedName("name")
        val name: Any?, // null
        @SerializedName("position")
        val position: Position?
    ) {
        data class Position(
            @SerializedName("latitude")
            val latitude: Double?, // 0.0
            @SerializedName("longitude")
            val longitude: Double? // 0.0
        )
    }

    data class Meta(
        @SerializedName("index")
        val index: Boolean? // true
    )

    data class RelatedCollections(
        @SerializedName("results")
        val results: List<Result?>?,
        @SerializedName("total")
        val total: Int?, // 3
        @SerializedName("type")
        val type: String? // related
    ) {
        data class Result(
            @SerializedName("cover_photo")
            val coverPhoto: CoverPhoto?,
            @SerializedName("description")
            val description: Any?, // null
            @SerializedName("featured")
            val featured: Boolean?, // false
            @SerializedName("id")
            val id: String?, // oXYouWJGFOw
            @SerializedName("last_collected_at")
            val lastCollectedAt: String?, // 2024-04-11T11:23:58Z
            @SerializedName("links")
            val links: Links?,
            @SerializedName("preview_photos")
            val previewPhotos: List<PreviewPhoto?>?,
            @SerializedName("private")
            val `private`: Boolean?, // false
            @SerializedName("published_at")
            val publishedAt: String?, // 2023-02-09T01:24:12Z
            @SerializedName("share_key")
            val shareKey: String?, // c4b3ecfa0ad6cca89de243f1e2f8e8a4
            @SerializedName("tags")
            val tags: List<Tag?>?,
            @SerializedName("title")
            val title: String?, // Any Wisp of a Story
            @SerializedName("total_photos")
            val totalPhotos: Int?, // 372
            @SerializedName("updated_at")
            val updatedAt: String?, // 2024-04-11T11:23:58Z
            @SerializedName("user")
            val user: User?
        ) {
            data class CoverPhoto(
                @SerializedName("alt_description")
                val altDescription: String?, // a room with a sign that says you'll think of something
                @SerializedName("alternative_slugs")
                val alternativeSlugs: AlternativeSlugs?,
                @SerializedName("asset_type")
                val assetType: String?, // photo
                @SerializedName("blur_hash")
                val blurHash: String?, // LEF5~o-T4nD%~qIUt6t74TIoog%M
                @SerializedName("breadcrumbs")
                val breadcrumbs: List<Any?>?,
                @SerializedName("color")
                val color: String?, // #262626
                @SerializedName("created_at")
                val createdAt: String?, // 2024-04-09T21:34:10Z
                @SerializedName("current_user_collections")
                val currentUserCollections: List<Any?>?,
                @SerializedName("description")
                val description: Any?, // null
                @SerializedName("height")
                val height: Int?, // 3601
                @SerializedName("id")
                val id: String?, // CSQEIr0eOZI
                @SerializedName("liked_by_user")
                val likedByUser: Boolean?, // false
                @SerializedName("likes")
                val likes: Int?, // 118
                @SerializedName("links")
                val links: Links?,
                @SerializedName("promoted_at")
                val promotedAt: String?, // 2024-04-11T09:20:10Z
                @SerializedName("slug")
                val slug: String?, // a-room-with-a-sign-that-says-youll-think-of-something-CSQEIr0eOZI
                @SerializedName("sponsorship")
                val sponsorship: Any?, // null
                @SerializedName("topic_submissions")
                val topicSubmissions: TopicSubmissions?,
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-04-12T08:41:01Z
                @SerializedName("urls")
                val urls: Urls?,
                @SerializedName("user")
                val user: User?,
                @SerializedName("width")
                val width: Int? // 2701
            ) {
                data class AlternativeSlugs(
                    @SerializedName("de")
                    val de: String?, // ein-zimmer-mit-einem-schild-auf-dem-steht-dass-dir-etwas-einfallt-CSQEIr0eOZI
                    @SerializedName("en")
                    val en: String?, // a-room-with-a-sign-that-says-youll-think-of-something-CSQEIr0eOZI
                    @SerializedName("es")
                    val es: String?, // una-habitacion-con-un-letrero-que-dice-que-pensaras-en-algo-CSQEIr0eOZI
                    @SerializedName("fr")
                    val fr: String?, // une-piece-avec-un-panneau-qui-dit-que-vous-allez-penser-a-quelque-chose-CSQEIr0eOZI
                    @SerializedName("it")
                    val `it`: String?, // una-stanza-con-un-cartello-che-dice-che-penserai-a-qualcosa-CSQEIr0eOZI
                    @SerializedName("ja")
                    val ja: String?, // 何かを思いつくという看板のある部屋-CSQEIr0eOZI
                    @SerializedName("ko")
                    val ko: String?, // 뭔가를-생각하게-될-것이라는-표지판이-있는-방-CSQEIr0eOZI
                    @SerializedName("pt")
                    val pt: String? // uma-sala-com-uma-placa-que-diz-que-voce-vai-pensar-em-algo-CSQEIr0eOZI
                )

                data class Links(
                    @SerializedName("download")
                    val download: String?, // https://unsplash.com/photos/CSQEIr0eOZI/download
                    @SerializedName("download_location")
                    val downloadLocation: String?, // https://api.unsplash.com/photos/CSQEIr0eOZI/download
                    @SerializedName("html")
                    val html: String?, // https://unsplash.com/photos/a-room-with-a-sign-that-says-youll-think-of-something-CSQEIr0eOZI
                    @SerializedName("self")
                    val self: String? // https://api.unsplash.com/photos/a-room-with-a-sign-that-says-youll-think-of-something-CSQEIr0eOZI
                )

                class TopicSubmissions

                data class Urls(
                    @SerializedName("full")
                    val full: String?, // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?ixlib=rb-4.0.3&q=85&fm=jpg&crop=entropy&cs=srgb
                    @SerializedName("raw")
                    val raw: String?, // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?ixlib=rb-4.0.3
                    @SerializedName("regular")
                    val regular: String?, // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max
                    @SerializedName("small")
                    val small: String?, // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max
                    @SerializedName("small_s3")
                    val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1712698396006-1996dc7cb2cc
                    @SerializedName("thumb")
                    val thumb: String? // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max
                )

                data class User(
                    @SerializedName("accepted_tos")
                    val acceptedTos: Boolean?, // true
                    @SerializedName("bio")
                    val bio: String?, // Send me links where you used my photos, it makes me happy.
                    @SerializedName("first_name")
                    val firstName: String?, // Andrei
                    @SerializedName("for_hire")
                    val forHire: Boolean?, // false
                    @SerializedName("id")
                    val id: String?, // 5lWUGxOTC2I
                    @SerializedName("instagram_username")
                    val instagramUsername: Any?, // null
                    @SerializedName("last_name")
                    val lastName: String?, // Slobtsov
                    @SerializedName("links")
                    val links: Links?,
                    @SerializedName("location")
                    val location: String?, // Chicago, IL
                    @SerializedName("name")
                    val name: String?, // Andrei Slobtsov
                    @SerializedName("portfolio_url")
                    val portfolioUrl: String?, // http://andreis.co/
                    @SerializedName("profile_image")
                    val profileImage: ProfileImage?,
                    @SerializedName("social")
                    val social: Social?,
                    @SerializedName("total_collections")
                    val totalCollections: Int?, // 0
                    @SerializedName("total_illustrations")
                    val totalIllustrations: Int?, // 0
                    @SerializedName("total_likes")
                    val totalLikes: Int?, // 1
                    @SerializedName("total_photos")
                    val totalPhotos: Int?, // 32
                    @SerializedName("total_promoted_illustrations")
                    val totalPromotedIllustrations: Int?, // 0
                    @SerializedName("total_promoted_photos")
                    val totalPromotedPhotos: Int?, // 4
                    @SerializedName("twitter_username")
                    val twitterUsername: String?, // andreis_co
                    @SerializedName("updated_at")
                    val updatedAt: String?, // 2024-04-12T02:59:14Z
                    @SerializedName("username")
                    val username: String? // andreislobtsov
                ) {
                    data class Links(
                        @SerializedName("followers")
                        val followers: String?, // https://api.unsplash.com/users/andreislobtsov/followers
                        @SerializedName("following")
                        val following: String?, // https://api.unsplash.com/users/andreislobtsov/following
                        @SerializedName("html")
                        val html: String?, // https://unsplash.com/@andreislobtsov
                        @SerializedName("likes")
                        val likes: String?, // https://api.unsplash.com/users/andreislobtsov/likes
                        @SerializedName("photos")
                        val photos: String?, // https://api.unsplash.com/users/andreislobtsov/photos
                        @SerializedName("portfolio")
                        val portfolio: String?, // https://api.unsplash.com/users/andreislobtsov/portfolio
                        @SerializedName("self")
                        val self: String? // https://api.unsplash.com/users/andreislobtsov
                    )

                    data class ProfileImage(
                        @SerializedName("large")
                        val large: String?, // https://images.unsplash.com/profile-1539725110195-41ec32b3f1c2?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                        @SerializedName("medium")
                        val medium: String?, // https://images.unsplash.com/profile-1539725110195-41ec32b3f1c2?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                        @SerializedName("small")
                        val small: String? // https://images.unsplash.com/profile-1539725110195-41ec32b3f1c2?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
                    )

                    data class Social(
                        @SerializedName("instagram_username")
                        val instagramUsername: Any?, // null
                        @SerializedName("paypal_email")
                        val paypalEmail: Any?, // null
                        @SerializedName("portfolio_url")
                        val portfolioUrl: String?, // http://andreis.co/
                        @SerializedName("twitter_username")
                        val twitterUsername: String? // andreis_co
                    )
                }
            }

            data class Links(
                @SerializedName("html")
                val html: String?, // https://unsplash.com/collections/oXYouWJGFOw/any-whisp-of-a-story
                @SerializedName("photos")
                val photos: String?, // https://api.unsplash.com/collections/oXYouWJGFOw/photos
                @SerializedName("related")
                val related: String?, // https://api.unsplash.com/collections/oXYouWJGFOw/related
                @SerializedName("self")
                val self: String? // https://api.unsplash.com/collections/oXYouWJGFOw
            )

            data class PreviewPhoto(
                @SerializedName("asset_type")
                val assetType: String?, // photo
                @SerializedName("blur_hash")
                val blurHash: String?, // LEF5~o-T4nD%~qIUt6t74TIoog%M
                @SerializedName("created_at")
                val createdAt: String?, // 2024-04-09T21:34:10Z
                @SerializedName("id")
                val id: String?, // CSQEIr0eOZI
                @SerializedName("slug")
                val slug: String?, // a-room-with-a-sign-that-says-youll-think-of-something-CSQEIr0eOZI
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-04-12T08:41:01Z
                @SerializedName("urls")
                val urls: Urls?
            ) {
                data class Urls(
                    @SerializedName("full")
                    val full: String?, // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?ixlib=rb-4.0.3&q=85&fm=jpg&crop=entropy&cs=srgb
                    @SerializedName("raw")
                    val raw: String?, // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?ixlib=rb-4.0.3
                    @SerializedName("regular")
                    val regular: String?, // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max
                    @SerializedName("small")
                    val small: String?, // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max
                    @SerializedName("small_s3")
                    val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1712698396006-1996dc7cb2cc
                    @SerializedName("thumb")
                    val thumb: String? // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max
                )
            }

            data class Tag(
                @SerializedName("source")
                val source: Source?,
                @SerializedName("title")
                val title: String?, // human
                @SerializedName("type")
                val type: String? // search
            ) {
                data class Source(
                    @SerializedName("ancestry")
                    val ancestry: Ancestry?,
                    @SerializedName("cover_photo")
                    val coverPhoto: CoverPhoto?,
                    @SerializedName("description")
                    val description: String?, // Choose from a curated selection of grey wallpapers for your mobile and desktop screens. Always free on Unsplash.
                    @SerializedName("meta_description")
                    val metaDescription: String?, // Choose from hundreds of free grey wallpapers. Download HD wallpapers for free on Unsplash.
                    @SerializedName("meta_title")
                    val metaTitle: String?, // Grey Wallpapers: Free HD Download [500+ HQ] | Unsplash
                    @SerializedName("subtitle")
                    val subtitle: String?, // Download free grey wallpapers
                    @SerializedName("title")
                    val title: String? // Hd grey wallpapers
                ) {
                    data class Ancestry(
                        @SerializedName("category")
                        val category: Category?,
                        @SerializedName("subcategory")
                        val subcategory: Subcategory?,
                        @SerializedName("type")
                        val type: Type?
                    ) {
                        data class Category(
                            @SerializedName("pretty_slug")
                            val prettySlug: String?, // Color
                            @SerializedName("slug")
                            val slug: String? // colors
                        )

                        data class Subcategory(
                            @SerializedName("pretty_slug")
                            val prettySlug: String?, // Grey
                            @SerializedName("slug")
                            val slug: String? // grey
                        )

                        data class Type(
                            @SerializedName("pretty_slug")
                            val prettySlug: String?, // HD Wallpapers
                            @SerializedName("slug")
                            val slug: String? // wallpapers
                        )
                    }

                    data class CoverPhoto(
                        @SerializedName("alt_description")
                        val altDescription: String?, // a close up of a gray concrete surface
                        @SerializedName("alternative_slugs")
                        val alternativeSlugs: AlternativeSlugs?,
                        @SerializedName("asset_type")
                        val assetType: String?, // photo
                        @SerializedName("blur_hash")
                        val blurHash: String?, // L3IYFNIU00~q-;M{R*t80KtRIUM{
                        @SerializedName("breadcrumbs")
                        val breadcrumbs: List<Breadcrumb?>?,
                        @SerializedName("color")
                        val color: String?, // #a6a6a6
                        @SerializedName("created_at")
                        val createdAt: String?, // 2018-09-10T08:05:55Z
                        @SerializedName("current_user_collections")
                        val currentUserCollections: List<Any?>?,
                        @SerializedName("description")
                        val description: String?, // Old stone background texture
                        @SerializedName("height")
                        val height: Int?, // 7952
                        @SerializedName("id")
                        val id: String?, // ctXf1GVyf9A
                        @SerializedName("liked_by_user")
                        val likedByUser: Boolean?, // false
                        @SerializedName("likes")
                        val likes: Int?, // 2196
                        @SerializedName("links")
                        val links: Links?,
                        @SerializedName("plus")
                        val plus: Boolean?, // false
                        @SerializedName("premium")
                        val premium: Boolean?, // false
                        @SerializedName("promoted_at")
                        val promotedAt: String?, // 2017-04-21T16:00:49Z
                        @SerializedName("slug")
                        val slug: String?, // a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                        @SerializedName("sponsorship")
                        val sponsorship: Any?, // null
                        @SerializedName("topic_submissions")
                        val topicSubmissions: TopicSubmissions?,
                        @SerializedName("updated_at")
                        val updatedAt: String?, // 2024-04-08T18:10:45Z
                        @SerializedName("urls")
                        val urls: Urls?,
                        @SerializedName("user")
                        val user: User?,
                        @SerializedName("width")
                        val width: Int? // 5304
                    ) {
                        data class AlternativeSlugs(
                            @SerializedName("de")
                            val de: String?, // nahaufnahme-einer-grauen-betonoberflache-ctXf1GVyf9A
                            @SerializedName("en")
                            val en: String?, // a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                            @SerializedName("es")
                            val es: String?, // un-primer-plano-de-una-superficie-de-hormigon-gris-ctXf1GVyf9A
                            @SerializedName("fr")
                            val fr: String?, // gros-plan-dune-surface-de-beton-gris-ctXf1GVyf9A
                            @SerializedName("it")
                            val `it`: String?, // un-primo-piano-di-una-superficie-di-cemento-grigio-ctXf1GVyf9A
                            @SerializedName("ja")
                            val ja: String?, // 灰色のコンクリート表面のクローズアップ-ctXf1GVyf9A
                            @SerializedName("ko")
                            val ko: String?, // 회색-콘크리트-표면의-클로즈업-ctXf1GVyf9A
                            @SerializedName("pt")
                            val pt: String? // um-close-up-de-uma-superficie-de-concreto-cinza-ctXf1GVyf9A
                        )

                        data class Breadcrumb(
                            @SerializedName("index")
                            val index: Int?, // 0
                            @SerializedName("slug")
                            val slug: String?, // images
                            @SerializedName("title")
                            val title: String?, // 1,000,000+ Free Images
                            @SerializedName("type")
                            val type: String? // landing_page
                        )

                        data class Links(
                            @SerializedName("download")
                            val download: String?, // https://unsplash.com/photos/ctXf1GVyf9A/download
                            @SerializedName("download_location")
                            val downloadLocation: String?, // https://api.unsplash.com/photos/ctXf1GVyf9A/download
                            @SerializedName("html")
                            val html: String?, // https://unsplash.com/photos/a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                            @SerializedName("self")
                            val self: String? // https://api.unsplash.com/photos/a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                        )

                        data class TopicSubmissions(
                            @SerializedName("current-events")
                            val currentEvents: CurrentEvents?,
                            @SerializedName("textures-patterns")
                            val texturesPatterns: TexturesPatterns?
                        ) {
                            data class CurrentEvents(
                                @SerializedName("approved_on")
                                val approvedOn: String?, // 2021-03-01T12:52:57Z
                                @SerializedName("status")
                                val status: String? // approved
                            )

                            data class TexturesPatterns(
                                @SerializedName("approved_on")
                                val approvedOn: String?, // 2020-04-06T14:20:11Z
                                @SerializedName("status")
                                val status: String? // approved
                            )
                        }

                        data class Urls(
                            @SerializedName("full")
                            val full: String?, // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3&q=85&fm=jpg&crop=entropy&cs=srgb
                            @SerializedName("raw")
                            val raw: String?, // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3
                            @SerializedName("regular")
                            val regular: String?, // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max
                            @SerializedName("small")
                            val small: String?, // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max
                            @SerializedName("small_s3")
                            val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1536566482680-fca31930a0bd
                            @SerializedName("thumb")
                            val thumb: String? // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max
                        )

                        data class User(
                            @SerializedName("accepted_tos")
                            val acceptedTos: Boolean?, // true
                            @SerializedName("bio")
                            val bio: String?, // Photographer from England, sharing my digital, film + vintage slide scans. anniespratt.com ✌️
                            @SerializedName("first_name")
                            val firstName: String?, // Annie
                            @SerializedName("for_hire")
                            val forHire: Boolean?, // false
                            @SerializedName("id")
                            val id: String?, // IFcEhJqem0Q
                            @SerializedName("instagram_username")
                            val instagramUsername: String?, // anniespratt
                            @SerializedName("last_name")
                            val lastName: String?, // Spratt
                            @SerializedName("links")
                            val links: Links?,
                            @SerializedName("location")
                            val location: String?, // New Forest National Park, UK
                            @SerializedName("name")
                            val name: String?, // Annie Spratt
                            @SerializedName("portfolio_url")
                            val portfolioUrl: String?, // https://www.anniespratt.com
                            @SerializedName("profile_image")
                            val profileImage: ProfileImage?,
                            @SerializedName("social")
                            val social: Social?,
                            @SerializedName("total_collections")
                            val totalCollections: Int?, // 71
                            @SerializedName("total_likes")
                            val totalLikes: Int?, // 14489
                            @SerializedName("total_photos")
                            val totalPhotos: Int?, // 21769
                            @SerializedName("total_promoted_photos")
                            val totalPromotedPhotos: Int?, // 3009
                            @SerializedName("twitter_username")
                            val twitterUsername: String?, // anniespratt
                            @SerializedName("updated_at")
                            val updatedAt: String?, // 2024-04-08T14:45:23Z
                            @SerializedName("username")
                            val username: String? // anniespratt
                        ) {
                            data class Links(
                                @SerializedName("followers")
                                val followers: String?, // https://api.unsplash.com/users/anniespratt/followers
                                @SerializedName("following")
                                val following: String?, // https://api.unsplash.com/users/anniespratt/following
                                @SerializedName("html")
                                val html: String?, // https://unsplash.com/@anniespratt
                                @SerializedName("likes")
                                val likes: String?, // https://api.unsplash.com/users/anniespratt/likes
                                @SerializedName("photos")
                                val photos: String?, // https://api.unsplash.com/users/anniespratt/photos
                                @SerializedName("portfolio")
                                val portfolio: String?, // https://api.unsplash.com/users/anniespratt/portfolio
                                @SerializedName("self")
                                val self: String? // https://api.unsplash.com/users/anniespratt
                            )

                            data class ProfileImage(
                                @SerializedName("large")
                                val large: String?, // https://images.unsplash.com/profile-1648828806223-1852f704c58aimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                                @SerializedName("medium")
                                val medium: String?, // https://images.unsplash.com/profile-1648828806223-1852f704c58aimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                                @SerializedName("small")
                                val small: String? // https://images.unsplash.com/profile-1648828806223-1852f704c58aimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
                            )

                            data class Social(
                                @SerializedName("instagram_username")
                                val instagramUsername: String?, // anniespratt
                                @SerializedName("paypal_email")
                                val paypalEmail: Any?, // null
                                @SerializedName("portfolio_url")
                                val portfolioUrl: String?, // https://www.anniespratt.com
                                @SerializedName("twitter_username")
                                val twitterUsername: String? // anniespratt
                            )
                        }
                    }
                }
            }

            data class User(
                @SerializedName("accepted_tos")
                val acceptedTos: Boolean?, // false
                @SerializedName("bio")
                val bio: String?, // Iam a student
                @SerializedName("first_name")
                val firstName: String?, // Blue Once
                @SerializedName("for_hire")
                val forHire: Boolean?, // false
                @SerializedName("id")
                val id: String?, // ir-fL7T2dr4
                @SerializedName("instagram_username")
                val instagramUsername: Any?, // null
                @SerializedName("last_name")
                val lastName: String?, // Moon
                @SerializedName("links")
                val links: Links?,
                @SerializedName("location")
                val location: String?, // Semarang, Indonesia
                @SerializedName("name")
                val name: String?, // Blue Once Moon
                @SerializedName("portfolio_url")
                val portfolioUrl: Any?, // null
                @SerializedName("profile_image")
                val profileImage: ProfileImage?,
                @SerializedName("social")
                val social: Social?,
                @SerializedName("total_collections")
                val totalCollections: Int?, // 7
                @SerializedName("total_illustrations")
                val totalIllustrations: Int?, // 0
                @SerializedName("total_likes")
                val totalLikes: Int?, // 0
                @SerializedName("total_photos")
                val totalPhotos: Int?, // 0
                @SerializedName("total_promoted_illustrations")
                val totalPromotedIllustrations: Int?, // 0
                @SerializedName("total_promoted_photos")
                val totalPromotedPhotos: Int?, // 0
                @SerializedName("twitter_username")
                val twitterUsername: Any?, // null
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-02-17T09:57:04Z
                @SerializedName("username")
                val username: String? // blueoncemoon
            ) {
                data class Links(
                    @SerializedName("followers")
                    val followers: String?, // https://api.unsplash.com/users/blueoncemoon/followers
                    @SerializedName("following")
                    val following: String?, // https://api.unsplash.com/users/blueoncemoon/following
                    @SerializedName("html")
                    val html: String?, // https://unsplash.com/@blueoncemoon
                    @SerializedName("likes")
                    val likes: String?, // https://api.unsplash.com/users/blueoncemoon/likes
                    @SerializedName("photos")
                    val photos: String?, // https://api.unsplash.com/users/blueoncemoon/photos
                    @SerializedName("portfolio")
                    val portfolio: String?, // https://api.unsplash.com/users/blueoncemoon/portfolio
                    @SerializedName("self")
                    val self: String? // https://api.unsplash.com/users/blueoncemoon
                )

                data class ProfileImage(
                    @SerializedName("large")
                    val large: String?, // https://images.unsplash.com/placeholder-avatars/extra-large.jpg?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                    @SerializedName("medium")
                    val medium: String?, // https://images.unsplash.com/placeholder-avatars/extra-large.jpg?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                    @SerializedName("small")
                    val small: String? // https://images.unsplash.com/placeholder-avatars/extra-large.jpg?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
                )

                data class Social(
                    @SerializedName("instagram_username")
                    val instagramUsername: Any?, // null
                    @SerializedName("paypal_email")
                    val paypalEmail: Any?, // null
                    @SerializedName("portfolio_url")
                    val portfolioUrl: Any?, // null
                    @SerializedName("twitter_username")
                    val twitterUsername: Any? // null
                )
            }
        }
    }

    data class Tag(
        @SerializedName("source")
        val source: Source?,
        @SerializedName("title")
        val title: String?, // grey
        @SerializedName("type")
        val type: String? // landing_page
    ) {
        data class Source(
            @SerializedName("ancestry")
            val ancestry: Ancestry?,
            @SerializedName("cover_photo")
            val coverPhoto: CoverPhoto?,
            @SerializedName("description")
            val description: String?, // Choose from a curated selection of grey wallpapers for your mobile and desktop screens. Always free on Unsplash.
            @SerializedName("meta_description")
            val metaDescription: String?, // Choose from hundreds of free grey wallpapers. Download HD wallpapers for free on Unsplash.
            @SerializedName("meta_title")
            val metaTitle: String?, // Grey Wallpapers: Free HD Download [500+ HQ] | Unsplash
            @SerializedName("subtitle")
            val subtitle: String?, // Download free grey wallpapers
            @SerializedName("title")
            val title: String? // Hd grey wallpapers
        ) {
            data class Ancestry(
                @SerializedName("category")
                val category: Category?,
                @SerializedName("subcategory")
                val subcategory: Subcategory?,
                @SerializedName("type")
                val type: Type?
            ) {
                data class Category(
                    @SerializedName("pretty_slug")
                    val prettySlug: String?, // Color
                    @SerializedName("slug")
                    val slug: String? // colors
                )

                data class Subcategory(
                    @SerializedName("pretty_slug")
                    val prettySlug: String?, // Grey
                    @SerializedName("slug")
                    val slug: String? // grey
                )

                data class Type(
                    @SerializedName("pretty_slug")
                    val prettySlug: String?, // HD Wallpapers
                    @SerializedName("slug")
                    val slug: String? // wallpapers
                )
            }

            data class CoverPhoto(
                @SerializedName("alt_description")
                val altDescription: String?, // a close up of a gray concrete surface
                @SerializedName("alternative_slugs")
                val alternativeSlugs: AlternativeSlugs?,
                @SerializedName("asset_type")
                val assetType: String?, // photo
                @SerializedName("blur_hash")
                val blurHash: String?, // L3IYFNIU00~q-;M{R*t80KtRIUM{
                @SerializedName("breadcrumbs")
                val breadcrumbs: List<Breadcrumb?>?,
                @SerializedName("color")
                val color: String?, // #a6a6a6
                @SerializedName("created_at")
                val createdAt: String?, // 2018-09-10T08:05:55Z
                @SerializedName("current_user_collections")
                val currentUserCollections: List<Any?>?,
                @SerializedName("description")
                val description: String?, // Old stone background texture
                @SerializedName("height")
                val height: Int?, // 7952
                @SerializedName("id")
                val id: String?, // ctXf1GVyf9A
                @SerializedName("liked_by_user")
                val likedByUser: Boolean?, // false
                @SerializedName("likes")
                val likes: Int?, // 2196
                @SerializedName("links")
                val links: Links?,
                @SerializedName("plus")
                val plus: Boolean?, // false
                @SerializedName("premium")
                val premium: Boolean?, // false
                @SerializedName("promoted_at")
                val promotedAt: String?, // 2017-07-15T02:49:56Z
                @SerializedName("slug")
                val slug: String?, // a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                @SerializedName("sponsorship")
                val sponsorship: Any?, // null
                @SerializedName("topic_submissions")
                val topicSubmissions: TopicSubmissions?,
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-04-08T18:10:45Z
                @SerializedName("urls")
                val urls: Urls?,
                @SerializedName("user")
                val user: User?,
                @SerializedName("width")
                val width: Int? // 5304
            ) {
                data class AlternativeSlugs(
                    @SerializedName("de")
                    val de: String?, // nahaufnahme-einer-grauen-betonoberflache-ctXf1GVyf9A
                    @SerializedName("en")
                    val en: String?, // a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                    @SerializedName("es")
                    val es: String?, // un-primer-plano-de-una-superficie-de-hormigon-gris-ctXf1GVyf9A
                    @SerializedName("fr")
                    val fr: String?, // gros-plan-dune-surface-de-beton-gris-ctXf1GVyf9A
                    @SerializedName("it")
                    val `it`: String?, // un-primo-piano-di-una-superficie-di-cemento-grigio-ctXf1GVyf9A
                    @SerializedName("ja")
                    val ja: String?, // 灰色のコンクリート表面のクローズアップ-ctXf1GVyf9A
                    @SerializedName("ko")
                    val ko: String?, // 회색-콘크리트-표면의-클로즈업-ctXf1GVyf9A
                    @SerializedName("pt")
                    val pt: String? // um-close-up-de-uma-superficie-de-concreto-cinza-ctXf1GVyf9A
                )

                data class Breadcrumb(
                    @SerializedName("index")
                    val index: Int?, // 0
                    @SerializedName("slug")
                    val slug: String?, // images
                    @SerializedName("title")
                    val title: String?, // 1,000,000+ Free Images
                    @SerializedName("type")
                    val type: String? // landing_page
                )

                data class Links(
                    @SerializedName("download")
                    val download: String?, // https://unsplash.com/photos/ctXf1GVyf9A/download
                    @SerializedName("download_location")
                    val downloadLocation: String?, // https://api.unsplash.com/photos/ctXf1GVyf9A/download
                    @SerializedName("html")
                    val html: String?, // https://unsplash.com/photos/a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                    @SerializedName("self")
                    val self: String? // https://api.unsplash.com/photos/a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                )

                data class TopicSubmissions(
                    @SerializedName("textures-patterns")
                    val texturesPatterns: TexturesPatterns?,
                    @SerializedName("wallpapers")
                    val wallpapers: Wallpapers?
                ) {
                    data class TexturesPatterns(
                        @SerializedName("approved_on")
                        val approvedOn: String?, // 2020-04-06T14:20:11Z
                        @SerializedName("status")
                        val status: String? // approved
                    )

                    data class Wallpapers(
                        @SerializedName("approved_on")
                        val approvedOn: String?, // 2020-04-06T14:20:09Z
                        @SerializedName("status")
                        val status: String? // approved
                    )
                }

                data class Urls(
                    @SerializedName("full")
                    val full: String?, // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3&q=85&fm=jpg&crop=entropy&cs=srgb
                    @SerializedName("raw")
                    val raw: String?, // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3
                    @SerializedName("regular")
                    val regular: String?, // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max
                    @SerializedName("small")
                    val small: String?, // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max
                    @SerializedName("small_s3")
                    val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1536566482680-fca31930a0bd
                    @SerializedName("thumb")
                    val thumb: String? // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max
                )

                data class User(
                    @SerializedName("accepted_tos")
                    val acceptedTos: Boolean?, // true
                    @SerializedName("bio")
                    val bio: String?, // Photographer from England, sharing my digital, film + vintage slide scans. anniespratt.com ✌️
                    @SerializedName("first_name")
                    val firstName: String?, // Annie
                    @SerializedName("for_hire")
                    val forHire: Boolean?, // false
                    @SerializedName("id")
                    val id: String?, // IFcEhJqem0Q
                    @SerializedName("instagram_username")
                    val instagramUsername: String?, // anniespratt
                    @SerializedName("last_name")
                    val lastName: String?, // Spratt
                    @SerializedName("links")
                    val links: Links?,
                    @SerializedName("location")
                    val location: String?, // New Forest National Park, UK
                    @SerializedName("name")
                    val name: String?, // Annie Spratt
                    @SerializedName("portfolio_url")
                    val portfolioUrl: String?, // https://www.anniespratt.com
                    @SerializedName("profile_image")
                    val profileImage: ProfileImage?,
                    @SerializedName("social")
                    val social: Social?,
                    @SerializedName("total_collections")
                    val totalCollections: Int?, // 71
                    @SerializedName("total_likes")
                    val totalLikes: Int?, // 14489
                    @SerializedName("total_photos")
                    val totalPhotos: Int?, // 21769
                    @SerializedName("total_promoted_photos")
                    val totalPromotedPhotos: Int?, // 3009
                    @SerializedName("twitter_username")
                    val twitterUsername: String?, // anniespratt
                    @SerializedName("updated_at")
                    val updatedAt: String?, // 2024-04-08T14:45:23Z
                    @SerializedName("username")
                    val username: String? // anniespratt
                ) {
                    data class Links(
                        @SerializedName("followers")
                        val followers: String?, // https://api.unsplash.com/users/anniespratt/followers
                        @SerializedName("following")
                        val following: String?, // https://api.unsplash.com/users/anniespratt/following
                        @SerializedName("html")
                        val html: String?, // https://unsplash.com/@anniespratt
                        @SerializedName("likes")
                        val likes: String?, // https://api.unsplash.com/users/anniespratt/likes
                        @SerializedName("photos")
                        val photos: String?, // https://api.unsplash.com/users/anniespratt/photos
                        @SerializedName("portfolio")
                        val portfolio: String?, // https://api.unsplash.com/users/anniespratt/portfolio
                        @SerializedName("self")
                        val self: String? // https://api.unsplash.com/users/anniespratt
                    )

                    data class ProfileImage(
                        @SerializedName("large")
                        val large: String?, // https://images.unsplash.com/profile-1648828806223-1852f704c58aimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                        @SerializedName("medium")
                        val medium: String?, // https://images.unsplash.com/profile-1648828806223-1852f704c58aimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                        @SerializedName("small")
                        val small: String? // https://images.unsplash.com/profile-1648828806223-1852f704c58aimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
                    )

                    data class Social(
                        @SerializedName("instagram_username")
                        val instagramUsername: String?, // anniespratt
                        @SerializedName("paypal_email")
                        val paypalEmail: Any?, // null
                        @SerializedName("portfolio_url")
                        val portfolioUrl: String?, // https://www.anniespratt.com
                        @SerializedName("twitter_username")
                        val twitterUsername: String? // anniespratt
                    )
                }
            }
        }
    }

    data class TagsPreview(
        @SerializedName("source")
        val source: Source?,
        @SerializedName("title")
        val title: String?, // grey
        @SerializedName("type")
        val type: String? // landing_page
    ) {
        data class Source(
            @SerializedName("ancestry")
            val ancestry: Ancestry?,
            @SerializedName("cover_photo")
            val coverPhoto: CoverPhoto?,
            @SerializedName("description")
            val description: String?, // Choose from a curated selection of grey wallpapers for your mobile and desktop screens. Always free on Unsplash.
            @SerializedName("meta_description")
            val metaDescription: String?, // Choose from hundreds of free grey wallpapers. Download HD wallpapers for free on Unsplash.
            @SerializedName("meta_title")
            val metaTitle: String?, // Grey Wallpapers: Free HD Download [500+ HQ] | Unsplash
            @SerializedName("subtitle")
            val subtitle: String?, // Download free grey wallpapers
            @SerializedName("title")
            val title: String? // Hd grey wallpapers
        ) {
            data class Ancestry(
                @SerializedName("category")
                val category: Category?,
                @SerializedName("subcategory")
                val subcategory: Subcategory?,
                @SerializedName("type")
                val type: Type?
            ) {
                data class Category(
                    @SerializedName("pretty_slug")
                    val prettySlug: String?, // Color
                    @SerializedName("slug")
                    val slug: String? // colors
                )

                data class Subcategory(
                    @SerializedName("pretty_slug")
                    val prettySlug: String?, // Grey
                    @SerializedName("slug")
                    val slug: String? // grey
                )

                data class Type(
                    @SerializedName("pretty_slug")
                    val prettySlug: String?, // HD Wallpapers
                    @SerializedName("slug")
                    val slug: String? // wallpapers
                )
            }

            data class CoverPhoto(
                @SerializedName("alt_description")
                val altDescription: String?, // a close up of a gray concrete surface
                @SerializedName("alternative_slugs")
                val alternativeSlugs: AlternativeSlugs?,
                @SerializedName("asset_type")
                val assetType: String?, // photo
                @SerializedName("blur_hash")
                val blurHash: String?, // L3IYFNIU00~q-;M{R*t80KtRIUM{
                @SerializedName("breadcrumbs")
                val breadcrumbs: List<Breadcrumb?>?,
                @SerializedName("color")
                val color: String?, // #a6a6a6
                @SerializedName("created_at")
                val createdAt: String?, // 2018-09-10T08:05:55Z
                @SerializedName("current_user_collections")
                val currentUserCollections: List<Any?>?,
                @SerializedName("description")
                val description: String?, // Old stone background texture
                @SerializedName("height")
                val height: Int?, // 7952
                @SerializedName("id")
                val id: String?, // ctXf1GVyf9A
                @SerializedName("liked_by_user")
                val likedByUser: Boolean?, // false
                @SerializedName("likes")
                val likes: Int?, // 2196
                @SerializedName("links")
                val links: Links?,
                @SerializedName("plus")
                val plus: Boolean?, // false
                @SerializedName("premium")
                val premium: Boolean?, // false
                @SerializedName("promoted_at")
                val promotedAt: String?, // 2017-07-15T02:49:56Z
                @SerializedName("slug")
                val slug: String?, // a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                @SerializedName("sponsorship")
                val sponsorship: Any?, // null
                @SerializedName("topic_submissions")
                val topicSubmissions: TopicSubmissions?,
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-04-08T18:10:45Z
                @SerializedName("urls")
                val urls: Urls?,
                @SerializedName("user")
                val user: User?,
                @SerializedName("width")
                val width: Int? // 5304
            ) {
                data class AlternativeSlugs(
                    @SerializedName("de")
                    val de: String?, // nahaufnahme-einer-grauen-betonoberflache-ctXf1GVyf9A
                    @SerializedName("en")
                    val en: String?, // a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                    @SerializedName("es")
                    val es: String?, // un-primer-plano-de-una-superficie-de-hormigon-gris-ctXf1GVyf9A
                    @SerializedName("fr")
                    val fr: String?, // gros-plan-dune-surface-de-beton-gris-ctXf1GVyf9A
                    @SerializedName("it")
                    val `it`: String?, // un-primo-piano-di-una-superficie-di-cemento-grigio-ctXf1GVyf9A
                    @SerializedName("ja")
                    val ja: String?, // 灰色のコンクリート表面のクローズアップ-ctXf1GVyf9A
                    @SerializedName("ko")
                    val ko: String?, // 회색-콘크리트-표면의-클로즈업-ctXf1GVyf9A
                    @SerializedName("pt")
                    val pt: String? // um-close-up-de-uma-superficie-de-concreto-cinza-ctXf1GVyf9A
                )

                data class Breadcrumb(
                    @SerializedName("index")
                    val index: Int?, // 0
                    @SerializedName("slug")
                    val slug: String?, // images
                    @SerializedName("title")
                    val title: String?, // 1,000,000+ Free Images
                    @SerializedName("type")
                    val type: String? // landing_page
                )

                data class Links(
                    @SerializedName("download")
                    val download: String?, // https://unsplash.com/photos/ctXf1GVyf9A/download
                    @SerializedName("download_location")
                    val downloadLocation: String?, // https://api.unsplash.com/photos/ctXf1GVyf9A/download
                    @SerializedName("html")
                    val html: String?, // https://unsplash.com/photos/a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                    @SerializedName("self")
                    val self: String? // https://api.unsplash.com/photos/a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                )

                data class TopicSubmissions(
                    @SerializedName("textures-patterns")
                    val texturesPatterns: TexturesPatterns?,
                    @SerializedName("wallpapers")
                    val wallpapers: Wallpapers?
                ) {
                    data class TexturesPatterns(
                        @SerializedName("approved_on")
                        val approvedOn: String?, // 2020-04-06T14:20:11Z
                        @SerializedName("status")
                        val status: String? // approved
                    )

                    data class Wallpapers(
                        @SerializedName("approved_on")
                        val approvedOn: String?, // 2020-04-06T14:20:09Z
                        @SerializedName("status")
                        val status: String? // approved
                    )
                }

                data class Urls(
                    @SerializedName("full")
                    val full: String?, // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3&q=85&fm=jpg&crop=entropy&cs=srgb
                    @SerializedName("raw")
                    val raw: String?, // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3
                    @SerializedName("regular")
                    val regular: String?, // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max
                    @SerializedName("small")
                    val small: String?, // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max
                    @SerializedName("small_s3")
                    val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1536566482680-fca31930a0bd
                    @SerializedName("thumb")
                    val thumb: String? // https://images.unsplash.com/photo-1536566482680-fca31930a0bd?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max
                )

                data class User(
                    @SerializedName("accepted_tos")
                    val acceptedTos: Boolean?, // true
                    @SerializedName("bio")
                    val bio: String?, // Photographer from England, sharing my digital, film + vintage slide scans. anniespratt.com ✌️
                    @SerializedName("first_name")
                    val firstName: String?, // Annie
                    @SerializedName("for_hire")
                    val forHire: Boolean?, // false
                    @SerializedName("id")
                    val id: String?, // IFcEhJqem0Q
                    @SerializedName("instagram_username")
                    val instagramUsername: String?, // anniespratt
                    @SerializedName("last_name")
                    val lastName: String?, // Spratt
                    @SerializedName("links")
                    val links: Links?,
                    @SerializedName("location")
                    val location: String?, // New Forest National Park, UK
                    @SerializedName("name")
                    val name: String?, // Annie Spratt
                    @SerializedName("portfolio_url")
                    val portfolioUrl: String?, // https://www.anniespratt.com
                    @SerializedName("profile_image")
                    val profileImage: ProfileImage?,
                    @SerializedName("social")
                    val social: Social?,
                    @SerializedName("total_collections")
                    val totalCollections: Int?, // 71
                    @SerializedName("total_likes")
                    val totalLikes: Int?, // 14489
                    @SerializedName("total_photos")
                    val totalPhotos: Int?, // 21769
                    @SerializedName("total_promoted_photos")
                    val totalPromotedPhotos: Int?, // 3009
                    @SerializedName("twitter_username")
                    val twitterUsername: String?, // anniespratt
                    @SerializedName("updated_at")
                    val updatedAt: String?, // 2024-04-08T14:45:23Z
                    @SerializedName("username")
                    val username: String? // anniespratt
                ) {
                    data class Links(
                        @SerializedName("followers")
                        val followers: String?, // https://api.unsplash.com/users/anniespratt/followers
                        @SerializedName("following")
                        val following: String?, // https://api.unsplash.com/users/anniespratt/following
                        @SerializedName("html")
                        val html: String?, // https://unsplash.com/@anniespratt
                        @SerializedName("likes")
                        val likes: String?, // https://api.unsplash.com/users/anniespratt/likes
                        @SerializedName("photos")
                        val photos: String?, // https://api.unsplash.com/users/anniespratt/photos
                        @SerializedName("portfolio")
                        val portfolio: String?, // https://api.unsplash.com/users/anniespratt/portfolio
                        @SerializedName("self")
                        val self: String? // https://api.unsplash.com/users/anniespratt
                    )

                    data class ProfileImage(
                        @SerializedName("large")
                        val large: String?, // https://images.unsplash.com/profile-1648828806223-1852f704c58aimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                        @SerializedName("medium")
                        val medium: String?, // https://images.unsplash.com/profile-1648828806223-1852f704c58aimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                        @SerializedName("small")
                        val small: String? // https://images.unsplash.com/profile-1648828806223-1852f704c58aimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
                    )

                    data class Social(
                        @SerializedName("instagram_username")
                        val instagramUsername: String?, // anniespratt
                        @SerializedName("paypal_email")
                        val paypalEmail: Any?, // null
                        @SerializedName("portfolio_url")
                        val portfolioUrl: String?, // https://www.anniespratt.com
                        @SerializedName("twitter_username")
                        val twitterUsername: String? // anniespratt
                    )
                }
            }
        }
    }

    class TopicSubmissions

    data class Urls(
        @SerializedName("full")
        val full: String?, // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?crop=entropy&cs=srgb&fm=jpg&ixid=M3w1NzA4MjR8MHwxfGFsbHx8fHx8fHx8fDE3MTI5MTQxMDV8&ixlib=rb-4.0.3&q=85
        @SerializedName("raw")
        val raw: String?, // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?ixid=M3w1NzA4MjR8MHwxfGFsbHx8fHx8fHx8fDE3MTI5MTQxMDV8&ixlib=rb-4.0.3
        @SerializedName("regular")
        val regular: String?, // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w1NzA4MjR8MHwxfGFsbHx8fHx8fHx8fDE3MTI5MTQxMDV8&ixlib=rb-4.0.3&q=80&w=1080
        @SerializedName("small")
        val small: String?, // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w1NzA4MjR8MHwxfGFsbHx8fHx8fHx8fDE3MTI5MTQxMDV8&ixlib=rb-4.0.3&q=80&w=400
        @SerializedName("small_s3")
        val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1712698396006-1996dc7cb2cc
        @SerializedName("thumb")
        val thumb: String? // https://images.unsplash.com/photo-1712698396006-1996dc7cb2cc?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w1NzA4MjR8MHwxfGFsbHx8fHx8fHx8fDE3MTI5MTQxMDV8&ixlib=rb-4.0.3&q=80&w=200
    )

    data class User(
        @SerializedName("accepted_tos")
        val acceptedTos: Boolean?, // true
        @SerializedName("bio")
        val bio: String?, // Send me links where you used my photos, it makes me happy.
        @SerializedName("first_name")
        val firstName: String?, // Andrei
        @SerializedName("for_hire")
        val forHire: Boolean?, // false
        @SerializedName("id")
        val id: String?, // 5lWUGxOTC2I
        @SerializedName("instagram_username")
        val instagramUsername: Any?, // null
        @SerializedName("last_name")
        val lastName: String?, // Slobtsov
        @SerializedName("links")
        val links: Links?,
        @SerializedName("location")
        val location: String?, // Chicago, IL
        @SerializedName("name")
        val name: String?, // Andrei Slobtsov
        @SerializedName("portfolio_url")
        val portfolioUrl: String?, // http://andreis.co/
        @SerializedName("profile_image")
        val profileImage: ProfileImage?,
        @SerializedName("social")
        val social: Social?,
        @SerializedName("total_collections")
        val totalCollections: Int?, // 0
        @SerializedName("total_illustrations")
        val totalIllustrations: Int?, // 0
        @SerializedName("total_likes")
        val totalLikes: Int?, // 1
        @SerializedName("total_photos")
        val totalPhotos: Int?, // 32
        @SerializedName("total_promoted_illustrations")
        val totalPromotedIllustrations: Int?, // 0
        @SerializedName("total_promoted_photos")
        val totalPromotedPhotos: Int?, // 4
        @SerializedName("twitter_username")
        val twitterUsername: String?, // andreis_co
        @SerializedName("updated_at")
        val updatedAt: String?, // 2024-04-12T02:59:14Z
        @SerializedName("username")
        val username: String? // andreislobtsov
    ) {
        data class Links(
            @SerializedName("followers")
            val followers: String?, // https://api.unsplash.com/users/andreislobtsov/followers
            @SerializedName("following")
            val following: String?, // https://api.unsplash.com/users/andreislobtsov/following
            @SerializedName("html")
            val html: String?, // https://unsplash.com/@andreislobtsov
            @SerializedName("likes")
            val likes: String?, // https://api.unsplash.com/users/andreislobtsov/likes
            @SerializedName("photos")
            val photos: String?, // https://api.unsplash.com/users/andreislobtsov/photos
            @SerializedName("portfolio")
            val portfolio: String?, // https://api.unsplash.com/users/andreislobtsov/portfolio
            @SerializedName("self")
            val self: String? // https://api.unsplash.com/users/andreislobtsov
        )

        data class ProfileImage(
            @SerializedName("large")
            val large: String?, // https://images.unsplash.com/profile-1539725110195-41ec32b3f1c2?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
            @SerializedName("medium")
            val medium: String?, // https://images.unsplash.com/profile-1539725110195-41ec32b3f1c2?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
            @SerializedName("small")
            val small: String? // https://images.unsplash.com/profile-1539725110195-41ec32b3f1c2?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
        )

        data class Social(
            @SerializedName("instagram_username")
            val instagramUsername: Any?, // null
            @SerializedName("paypal_email")
            val paypalEmail: Any?, // null
            @SerializedName("portfolio_url")
            val portfolioUrl: String?, // http://andreis.co/
            @SerializedName("twitter_username")
            val twitterUsername: String? // andreis_co
        )
    }
}