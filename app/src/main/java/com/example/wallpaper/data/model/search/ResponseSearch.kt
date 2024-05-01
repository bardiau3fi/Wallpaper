package com.example.wallpaper.data.model.search


import com.google.gson.annotations.SerializedName

data class ResponseSearch(
    @SerializedName("results")
    val results: List<Result>?,
    @SerializedName("total")
    val total: Int?, // 10000
    @SerializedName("total_pages")
    val totalPages: Int? // 1000
) {
    data class Result(
        @SerializedName("alt_description")
        val altDescription: String?, // man wearing eyeglasses and sleeveless top
        @SerializedName("alternative_slugs")
        val alternativeSlugs: AlternativeSlugs?,
        @SerializedName("asset_type")
        val assetType: String?, // photo
        @SerializedName("blur_hash")
        val blurHash: String?, // LmLg;LIU_NX9?bRPIUxutln%WAt7
        @SerializedName("breadcrumbs")
        val breadcrumbs: List<Breadcrumb?>?,
        @SerializedName("color")
        val color: String?, // #f3f3f3
        @SerializedName("created_at")
        val createdAt: String?, // 2017-08-22T23:09:44Z
        @SerializedName("current_user_collections")
        val currentUserCollections: List<Any?>?,
        @SerializedName("description")
        val description: String?, // mehdizadeh
        @SerializedName("height")
        val height: Int?, // 6000
        @SerializedName("id")
        val id: String?, // Py8F6-hRn5o
        @SerializedName("liked_by_user")
        val likedByUser: Boolean?, // false
        @SerializedName("likes")
        val likes: Int?, // 742
        @SerializedName("links")
        val links: Links?,
        @SerializedName("promoted_at")
        val promotedAt: String?, // 2018-08-12T14:40:42Z
        @SerializedName("slug")
        val slug: String?, // man-wearing-eyeglasses-and-sleeveless-top-Py8F6-hRn5o
        @SerializedName("sponsorship")
        val sponsorship: Any?, // null
        @SerializedName("tags")
        val tags: List<Tag?>?,
        @SerializedName("topic_submissions")
        val topicSubmissions: TopicSubmissions?,
        @SerializedName("updated_at")
        val updatedAt: String?, // 2024-04-09T20:53:10Z
        @SerializedName("urls")
        val urls: Urls?,
        @SerializedName("user")
        val user: User?,
        @SerializedName("width")
        val width: Int? // 3376
    ) {
        data class AlternativeSlugs(
            @SerializedName("de")
            val de: String?, // mann-mit-brille-und-armellosem-oberteil-Py8F6-hRn5o
            @SerializedName("en")
            val en: String?, // man-wearing-eyeglasses-and-sleeveless-top-Py8F6-hRn5o
            @SerializedName("es")
            val es: String?, // hombre-con-anteojos-y-blusa-sin-mangas-Py8F6-hRn5o
            @SerializedName("fr")
            val fr: String?, // homme-portant-des-lunettes-et-un-haut-sans-manches-Py8F6-hRn5o
            @SerializedName("it")
            val `it`: String?, // uomo-che-indossa-occhiali-da-vista-e-top-senza-maniche-Py8F6-hRn5o
            @SerializedName("ja")
            val ja: String?, // 眼鏡とノースリーブのトップスを着た男性-Py8F6-hRn5o
            @SerializedName("ko")
            val ko: String?, // 안경과-민소매-상의를-입은-남자-Py8F6-hRn5o
            @SerializedName("pt")
            val pt: String? // homem-usando-oculos-e-top-sem-mangas-Py8F6-hRn5o
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
            val download: String?, // https://unsplash.com/photos/Py8F6-hRn5o/download?ixid=M3w1NzA4MjR8MHwxfHNlYXJjaHwxfHxtZW58ZW58MHx8fHwxNzEyNzU1NzIwfDA
            @SerializedName("download_location")
            val downloadLocation: String?, // https://api.unsplash.com/photos/Py8F6-hRn5o/download?ixid=M3w1NzA4MjR8MHwxfHNlYXJjaHwxfHxtZW58ZW58MHx8fHwxNzEyNzU1NzIwfDA
            @SerializedName("html")
            val html: String?, // https://unsplash.com/photos/man-wearing-eyeglasses-and-sleeveless-top-Py8F6-hRn5o
            @SerializedName("self")
            val self: String? // https://api.unsplash.com/photos/man-wearing-eyeglasses-and-sleeveless-top-Py8F6-hRn5o
        )

        data class Tag(
            @SerializedName("source")
            val source: Source?,
            @SerializedName("title")
            val title: String?, // nice looking
            @SerializedName("type")
            val type: String? // search
        ) {
            data class Source(
                @SerializedName("ancestry")
                val ancestry: Ancestry?,
                @SerializedName("cover_photo")
                val coverPhoto: CoverPhoto?,
                @SerializedName("description")
                val description: String?, // Choose from a curated selection of attractive photos. Always free on Unsplash.
                @SerializedName("meta_description")
                val metaDescription: String?, // Download the perfect attractive pictures. Find over 100+ of the best free attractive images. Free for commercial use ✓ No attribution required ✓ Copyright-free ✓
                @SerializedName("meta_title")
                val metaTitle: String?, // 500+ Attractive Pictures [HD] | Download Free Images on Unsplash
                @SerializedName("subtitle")
                val subtitle: String?, // Download free attractive images
                @SerializedName("title")
                val title: String? // Attractive pictures
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
                        val prettySlug: String?, // People
                        @SerializedName("slug")
                        val slug: String? // people
                    )

                    data class Subcategory(
                        @SerializedName("pretty_slug")
                        val prettySlug: String?, // Attractive
                        @SerializedName("slug")
                        val slug: String? // attractive
                    )

                    data class Type(
                        @SerializedName("pretty_slug")
                        val prettySlug: String?, // Images
                        @SerializedName("slug")
                        val slug: String? // images
                    )
                }

                data class CoverPhoto(
                    @SerializedName("alt_description")
                    val altDescription: String?, // man standing in front of a glass wall
                    @SerializedName("alternative_slugs")
                    val alternativeSlugs: AlternativeSlugs?,
                    @SerializedName("asset_type")
                    val assetType: String?, // photo
                    @SerializedName("blur_hash")
                    val blurHash: String?, // L45=b3a00KO@D%tRt7Rj4.NG-p$g
                    @SerializedName("breadcrumbs")
                    val breadcrumbs: List<Breadcrumb?>?,
                    @SerializedName("color")
                    val color: String?, // #E4D3D5
                    @SerializedName("created_at")
                    val createdAt: String?, // 2018-04-22T07:58:37Z
                    @SerializedName("current_user_collections")
                    val currentUserCollections: List<Any?>?,
                    @SerializedName("description")
                    val description: String?, // Summer in France with baby
                    @SerializedName("height")
                    val height: Int?, // 3064
                    @SerializedName("id")
                    val id: String?, // ijgiYCvkrSk
                    @SerializedName("liked_by_user")
                    val likedByUser: Boolean?, // false
                    @SerializedName("likes")
                    val likes: Int?, // 140
                    @SerializedName("links")
                    val links: Links?,
                    @SerializedName("plus")
                    val plus: Boolean?, // false
                    @SerializedName("premium")
                    val premium: Boolean?, // false
                    @SerializedName("promoted_at")
                    val promotedAt: String?, // 2018-04-22T09:13:35Z
                    @SerializedName("slug")
                    val slug: String?, // man-standing-in-front-of-a-glass-wall-ijgiYCvkrSk
                    @SerializedName("sponsorship")
                    val sponsorship: Any?, // null
                    @SerializedName("topic_submissions")
                    val topicSubmissions: TopicSubmissions?,
                    @SerializedName("updated_at")
                    val updatedAt: String?, // 2022-12-03T23:19:27Z
                    @SerializedName("urls")
                    val urls: Urls?,
                    @SerializedName("user")
                    val user: User?,
                    @SerializedName("width")
                    val width: Int? // 4592
                ) {
                    data class AlternativeSlugs(
                        @SerializedName("de")
                        val de: String?, // mann-vor-einer-glaswand-ijgiYCvkrSk
                        @SerializedName("en")
                        val en: String?, // man-standing-in-front-of-a-glass-wall-ijgiYCvkrSk
                        @SerializedName("es")
                        val es: String?, // hombre-de-pie-frente-a-una-pared-de-cristal-ijgiYCvkrSk
                        @SerializedName("fr")
                        val fr: String?, // homme-debout-devant-un-mur-de-verre-ijgiYCvkrSk
                        @SerializedName("it")
                        val `it`: String?, // uomo-in-piedi-davanti-a-una-parete-di-vetro-ijgiYCvkrSk
                        @SerializedName("ja")
                        val ja: String?, // ガラスの壁の前に立つ男-ijgiYCvkrSk
                        @SerializedName("ko")
                        val ko: String?, // 유리-벽-앞에-서-있는-남자-ijgiYCvkrSk
                        @SerializedName("pt")
                        val pt: String? // homem-em-pe-na-frente-de-uma-parede-de-vidro-ijgiYCvkrSk
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
                        val download: String?, // https://unsplash.com/photos/ijgiYCvkrSk/download
                        @SerializedName("download_location")
                        val downloadLocation: String?, // https://api.unsplash.com/photos/ijgiYCvkrSk/download
                        @SerializedName("html")
                        val html: String?, // https://unsplash.com/photos/man-standing-in-front-of-a-glass-wall-ijgiYCvkrSk
                        @SerializedName("self")
                        val self: String? // https://api.unsplash.com/photos/man-standing-in-front-of-a-glass-wall-ijgiYCvkrSk
                    )

                    data class TopicSubmissions(
                        @SerializedName("current-events")
                        val currentEvents: CurrentEvents?,
                        @SerializedName("friends")
                        val friends: Friends?,
                        @SerializedName("textures-patterns")
                        val texturesPatterns: TexturesPatterns?
                    ) {
                        data class CurrentEvents(
                            @SerializedName("approved_on")
                            val approvedOn: String?, // 2021-03-01T12:52:57Z
                            @SerializedName("status")
                            val status: String? // approved
                        )

                        data class Friends(
                            @SerializedName("approved_on")
                            val approvedOn: String?, // 2021-09-15T15:21:20Z
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
                        val full: String?, // https://images.unsplash.com/photo-1524383902853-96c857a3c78d?ixlib=rb-4.0.3&q=85&fm=jpg&crop=entropy&cs=srgb
                        @SerializedName("raw")
                        val raw: String?, // https://images.unsplash.com/photo-1524383902853-96c857a3c78d?ixlib=rb-4.0.3
                        @SerializedName("regular")
                        val regular: String?, // https://images.unsplash.com/photo-1524383902853-96c857a3c78d?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max
                        @SerializedName("small")
                        val small: String?, // https://images.unsplash.com/photo-1524383902853-96c857a3c78d?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max
                        @SerializedName("small_s3")
                        val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1524383902853-96c857a3c78d
                        @SerializedName("thumb")
                        val thumb: String? // https://images.unsplash.com/photo-1524383902853-96c857a3c78d?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max
                    )

                    data class User(
                        @SerializedName("accepted_tos")
                        val acceptedTos: Boolean?, // true
                        @SerializedName("bio")
                        val bio: String?, // Life is a one time offer, use it well.Contact me: davidsthephotographer@gmail.comInstagram: davidsthephotographer
                        @SerializedName("first_name")
                        val firstName: String?, // Davids
                        @SerializedName("for_hire")
                        val forHire: Boolean?, // false
                        @SerializedName("id")
                        val id: String?, // z7XWeDw0s9w
                        @SerializedName("instagram_username")
                        val instagramUsername: String?, // davidsthephotographer
                        @SerializedName("last_name")
                        val lastName: String?, // Kokainis
                        @SerializedName("links")
                        val links: Links?,
                        @SerializedName("location")
                        val location: String?, // Tilburg, The Netherlands
                        @SerializedName("name")
                        val name: String?, // Davids Kokainis
                        @SerializedName("portfolio_url")
                        val portfolioUrl: String?, // https://www.anniespratt.com
                        @SerializedName("profile_image")
                        val profileImage: ProfileImage?,
                        @SerializedName("social")
                        val social: Social?,
                        @SerializedName("total_collections")
                        val totalCollections: Int?, // 0
                        @SerializedName("total_likes")
                        val totalLikes: Int?, // 121
                        @SerializedName("total_photos")
                        val totalPhotos: Int?, // 0
                        @SerializedName("total_promoted_photos")
                        val totalPromotedPhotos: Int?, // 0
                        @SerializedName("twitter_username")
                        val twitterUsername: String?, // thedakotacorbin
                        @SerializedName("updated_at")
                        val updatedAt: String?, // 2021-06-29T07:49:33Z
                        @SerializedName("username")
                        val username: String? // davidsthephotographer_1153372_sink
                    ) {
                        data class Links(
                            @SerializedName("followers")
                            val followers: String?, // https://api.unsplash.com/users/davidsthephotographer_1153372_sink/followers
                            @SerializedName("following")
                            val following: String?, // https://api.unsplash.com/users/davidsthephotographer_1153372_sink/following
                            @SerializedName("html")
                            val html: String?, // https://unsplash.com/@davidsthephotographer_1153372_sink
                            @SerializedName("likes")
                            val likes: String?, // https://api.unsplash.com/users/davidsthephotographer_1153372_sink/likes
                            @SerializedName("photos")
                            val photos: String?, // https://api.unsplash.com/users/davidsthephotographer_1153372_sink/photos
                            @SerializedName("portfolio")
                            val portfolio: String?, // https://api.unsplash.com/users/davidsthephotographer_1153372_sink/portfolio
                            @SerializedName("self")
                            val self: String? // https://api.unsplash.com/users/davidsthephotographer_1153372_sink
                        )

                        data class ProfileImage(
                            @SerializedName("large")
                            val large: String?, // https://images.unsplash.com/profile-1547396929767-b5c328e9d6e3?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                            @SerializedName("medium")
                            val medium: String?, // https://images.unsplash.com/profile-1547396929767-b5c328e9d6e3?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                            @SerializedName("small")
                            val small: String? // https://images.unsplash.com/profile-1547396929767-b5c328e9d6e3?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
                        )

                        data class Social(
                            @SerializedName("instagram_username")
                            val instagramUsername: String?, // davidsthephotographer
                            @SerializedName("paypal_email")
                            val paypalEmail: Any?, // null
                            @SerializedName("portfolio_url")
                            val portfolioUrl: String?, // https://www.anniespratt.com
                            @SerializedName("twitter_username")
                            val twitterUsername: String? // thedakotacorbin
                        )
                    }
                }
            }
        }

        data class TopicSubmissions(
            @SerializedName("business-work")
            val businessWork: BusinessWork?,
            @SerializedName("people")
            val people: People?
        ) {
            data class BusinessWork(
                @SerializedName("approved_on")
                val approvedOn: String?, // 2020-07-03T12:30:44Z
                @SerializedName("status")
                val status: String? // approved
            )

            data class People(
                @SerializedName("approved_on")
                val approvedOn: String?, // 2021-03-19T12:28:13Z
                @SerializedName("status")
                val status: String? // approved
            )
        }

        data class Urls(
            @SerializedName("full")
            val full: String?, // https://images.unsplash.com/photo-1503443207922-dff7d543fd0e?crop=entropy&cs=srgb&fm=jpg&ixid=M3w1NzA4MjR8MHwxfHNlYXJjaHwxfHxtZW58ZW58MHx8fHwxNzEyNzU1NzIwfDA&ixlib=rb-4.0.3&q=85
            @SerializedName("raw")
            val raw: String?, // https://images.unsplash.com/photo-1503443207922-dff7d543fd0e?ixid=M3w1NzA4MjR8MHwxfHNlYXJjaHwxfHxtZW58ZW58MHx8fHwxNzEyNzU1NzIwfDA&ixlib=rb-4.0.3
            @SerializedName("regular")
            val regular: String?, // https://images.unsplash.com/photo-1503443207922-dff7d543fd0e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w1NzA4MjR8MHwxfHNlYXJjaHwxfHxtZW58ZW58MHx8fHwxNzEyNzU1NzIwfDA&ixlib=rb-4.0.3&q=80&w=1080
            @SerializedName("small")
            val small: String?, // https://images.unsplash.com/photo-1503443207922-dff7d543fd0e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w1NzA4MjR8MHwxfHNlYXJjaHwxfHxtZW58ZW58MHx8fHwxNzEyNzU1NzIwfDA&ixlib=rb-4.0.3&q=80&w=400
            @SerializedName("small_s3")
            val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1503443207922-dff7d543fd0e
            @SerializedName("thumb")
            val thumb: String? // https://images.unsplash.com/photo-1503443207922-dff7d543fd0e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w1NzA4MjR8MHwxfHNlYXJjaHwxfHxtZW58ZW58MHx8fHwxNzEyNzU1NzIwfDA&ixlib=rb-4.0.3&q=80&w=200
        )

        data class User(
            @SerializedName("accepted_tos")
            val acceptedTos: Boolean?, // true
            @SerializedName("bio")
            val bio: String?, // My name is Albert Dera. I am a Photographer based out of Sacramento, CA. Photography has given me the opportunity to capture wonderful moments; memories that can be kept for a lifetime. Instagram: @albertdera
            @SerializedName("first_name")
            val firstName: String?, // Mubariz
            @SerializedName("for_hire")
            val forHire: Boolean?, // true
            @SerializedName("id")
            val id: String?, // FNMCjtkboAI
            @SerializedName("instagram_username")
            val instagramUsername: String?, // mehdi_zadeh
            @SerializedName("last_name")
            val lastName: String?, // Mehdizadeh
            @SerializedName("links")
            val links: Links?,
            @SerializedName("location")
            val location: String?, // Baku, Azerbaijan
            @SerializedName("name")
            val name: String?, // Mubariz Mehdizadeh
            @SerializedName("portfolio_url")
            val portfolioUrl: String?, // http://gregoryhayes.photography
            @SerializedName("profile_image")
            val profileImage: ProfileImage?,
            @SerializedName("social")
            val social: Social?,
            @SerializedName("total_collections")
            val totalCollections: Int?, // 0
            @SerializedName("total_illustrations")
            val totalIllustrations: Int?, // 0
            @SerializedName("total_likes")
            val totalLikes: Int?, // 30
            @SerializedName("total_photos")
            val totalPhotos: Int?, // 45
            @SerializedName("total_promoted_illustrations")
            val totalPromotedIllustrations: Int?, // 0
            @SerializedName("total_promoted_photos")
            val totalPromotedPhotos: Int?, // 22
            @SerializedName("twitter_username")
            val twitterUsername: String?, // mehdi_zadeh
            @SerializedName("updated_at")
            val updatedAt: String?, // 2024-04-02T12:08:45Z
            @SerializedName("username")
            val username: String? // mehdizadeh
        ) {
            data class Links(
                @SerializedName("followers")
                val followers: String?, // https://api.unsplash.com/users/mehdizadeh/followers
                @SerializedName("following")
                val following: String?, // https://api.unsplash.com/users/mehdizadeh/following
                @SerializedName("html")
                val html: String?, // https://unsplash.com/@mehdizadeh
                @SerializedName("likes")
                val likes: String?, // https://api.unsplash.com/users/mehdizadeh/likes
                @SerializedName("photos")
                val photos: String?, // https://api.unsplash.com/users/mehdizadeh/photos
                @SerializedName("portfolio")
                val portfolio: String?, // https://api.unsplash.com/users/mehdizadeh/portfolio
                @SerializedName("self")
                val self: String? // https://api.unsplash.com/users/mehdizadeh
            )

            data class ProfileImage(
                @SerializedName("large")
                val large: String?, // https://images.unsplash.com/profile-fb-1502703436-d3cf7768cf64.jpg?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                @SerializedName("medium")
                val medium: String?, // https://images.unsplash.com/profile-fb-1502703436-d3cf7768cf64.jpg?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                @SerializedName("small")
                val small: String? // https://images.unsplash.com/profile-fb-1502703436-d3cf7768cf64.jpg?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
            )

            data class Social(
                @SerializedName("instagram_username")
                val instagramUsername: String?, // mehdi_zadeh
                @SerializedName("paypal_email")
                val paypalEmail: Any?, // null
                @SerializedName("portfolio_url")
                val portfolioUrl: String?, // http://gregoryhayes.photography
                @SerializedName("twitter_username")
                val twitterUsername: String? // mehdi_zadeh
            )
        }
    }
}