package com.example.wallpaper.data.model.splash


import com.google.gson.annotations.SerializedName

data class ResponseRandom(
    @SerializedName("alt_description")
    val altDescription: String?, // a black and white photo of a stairway
    @SerializedName("blur_hash")
    val blurHash: String?, // LHDvfy%MofWB~q-;M{t7-;IURjay
    @SerializedName("breadcrumbs")
    val breadcrumbs: List<Any?>?,
    @SerializedName("color")
    val color: String?, // #a6a6a6
    @SerializedName("created_at")
    val createdAt: String?, // 2024-01-28T14:27:16Z
    @SerializedName("current_user_collections")
    val currentUserCollections: List<Any?>?,
    @SerializedName("description")
    val description: String?, // Shadows and Concrete: An Artful Intersection of Light on Architectural Elements
    @SerializedName("downloads")
    val downloads: Int?, // 3562
    @SerializedName("exif")
    val exif: Exif?,
    @SerializedName("height")
    val height: Int?, // 5500
    @SerializedName("id")
    val id: String?, // 1tD5AHzcrDQ
    @SerializedName("liked_by_user")
    val likedByUser: Boolean?, // false
    @SerializedName("likes")
    val likes: Int?, // 65
    @SerializedName("links")
    val links: Links?,
    @SerializedName("location")
    val location: Location?,
    @SerializedName("meta")
    val meta: Meta?,
    @SerializedName("promoted_at")
    val promotedAt: String?, // 2024-02-01T11:16:01Z
    @SerializedName("public_domain")
    val publicDomain: Boolean?, // false
    @SerializedName("slug")
    val slug: String?, // a-black-and-white-photo-of-a-stairway-1tD5AHzcrDQ
    @SerializedName("sponsorship")
    val sponsorship: Any?, // null
    @SerializedName("tags")
    val tags: List<Tag?>?,
    @SerializedName("tags_preview")
    val tagsPreview: List<TagsPreview?>?,
    @SerializedName("topic_submissions")
    val topicSubmissions: TopicSubmissions?,
    @SerializedName("topics")
    val topics: List<Topic?>?,
    @SerializedName("updated_at")
    val updatedAt: String?, // 2024-02-25T09:56:28Z
    @SerializedName("urls")
    val urls: Urls?,
    @SerializedName("user")
    val user: User?,
    @SerializedName("views")
    val views: Int?, // 351426
    @SerializedName("width")
    val width: Int? // 3642
) {
    data class Exif(
        @SerializedName("aperture")
        val aperture: String?, // 6.8
        @SerializedName("exposure_time")
        val exposureTime: String?, // 1/250
        @SerializedName("focal_length")
        val focalLength: String?, // 35.0
        @SerializedName("iso")
        val iso: Int?, // 64
        @SerializedName("make")
        val make: String?, // Leica Camera AG
        @SerializedName("model")
        val model: String?, // LEICA M11
        @SerializedName("name")
        val name: String? // Leica Camera AG, LEICA M11
    )

    data class Links(
        @SerializedName("download")
        val download: String?, // https://unsplash.com/photos/1tD5AHzcrDQ/download?ixid=M3w1NzA4MjR8MHwxfHJhbmRvbXx8fHx8fHx8fDE3MDg4NTkyNzF8
        @SerializedName("download_location")
        val downloadLocation: String?, // https://api.unsplash.com/photos/1tD5AHzcrDQ/download?ixid=M3w1NzA4MjR8MHwxfHJhbmRvbXx8fHx8fHx8fDE3MDg4NTkyNzF8
        @SerializedName("html")
        val html: String?, // https://unsplash.com/photos/a-black-and-white-photo-of-a-stairway-1tD5AHzcrDQ
        @SerializedName("self")
        val self: String? // https://api.unsplash.com/photos/a-black-and-white-photo-of-a-stairway-1tD5AHzcrDQ
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
                val likes: Int?, // 2161
                @SerializedName("links")
                val links: Links?,
                @SerializedName("plus")
                val plus: Boolean?, // false
                @SerializedName("premium")
                val premium: Boolean?, // false
                @SerializedName("promoted_at")
                val promotedAt: String?, // 2016-10-07T15:56:54Z
                @SerializedName("slug")
                val slug: String?, // a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                @SerializedName("sponsorship")
                val sponsorship: Any?, // null
                @SerializedName("topic_submissions")
                val topicSubmissions: TopicSubmissions?,
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-02-19T18:15:54Z
                @SerializedName("urls")
                val urls: Urls?,
                @SerializedName("user")
                val user: User?,
                @SerializedName("width")
                val width: Int? // 5304
            ) {
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
                    val texturesPatterns: TexturesPatterns?
                ) {
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
                    val totalCollections: Int?, // 59
                    @SerializedName("total_likes")
                    val totalLikes: Int?, // 14485
                    @SerializedName("total_photos")
                    val totalPhotos: Int?, // 21012
                    @SerializedName("total_promoted_photos")
                    val totalPromotedPhotos: Int?, // 2986
                    @SerializedName("twitter_username")
                    val twitterUsername: String?, // anniespratt
                    @SerializedName("updated_at")
                    val updatedAt: String?, // 2024-02-20T05:52:04Z
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
                val likes: Int?, // 2161
                @SerializedName("links")
                val links: Links?,
                @SerializedName("plus")
                val plus: Boolean?, // false
                @SerializedName("premium")
                val premium: Boolean?, // false
                @SerializedName("promoted_at")
                val promotedAt: Any?, // null
                @SerializedName("slug")
                val slug: String?, // a-close-up-of-a-gray-concrete-surface-ctXf1GVyf9A
                @SerializedName("sponsorship")
                val sponsorship: Any?, // null
                @SerializedName("topic_submissions")
                val topicSubmissions: TopicSubmissions?,
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-02-19T18:15:54Z
                @SerializedName("urls")
                val urls: Urls?,
                @SerializedName("user")
                val user: User?,
                @SerializedName("width")
                val width: Int? // 5304
            ) {
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
                    val texturesPatterns: TexturesPatterns?
                ) {
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
                    val totalCollections: Int?, // 59
                    @SerializedName("total_likes")
                    val totalLikes: Int?, // 14485
                    @SerializedName("total_photos")
                    val totalPhotos: Int?, // 21012
                    @SerializedName("total_promoted_photos")
                    val totalPromotedPhotos: Int?, // 2986
                    @SerializedName("twitter_username")
                    val twitterUsername: String?, // anniespratt
                    @SerializedName("updated_at")
                    val updatedAt: String?, // 2024-02-20T05:52:04Z
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

    data class TopicSubmissions(
        @SerializedName("architecture-interior")
        val architectureInterior: ArchitectureInterior?,
        @SerializedName("street-photography")
        val streetPhotography: StreetPhotography?
    ) {
        data class ArchitectureInterior(
            @SerializedName("approved_on")
            val approvedOn: String?, // 2024-01-30T23:42:53Z
            @SerializedName("status")
            val status: String? // approved
        )

        data class StreetPhotography(
            @SerializedName("status")
            val status: String? // rejected
        )
    }

    data class Topic(
        @SerializedName("id")
        val id: String?, // M8jVbLbTRws
        @SerializedName("slug")
        val slug: String?, // architecture-interior
        @SerializedName("title")
        val title: String?, // Architecture & Interiors
        @SerializedName("visibility")
        val visibility: String? // featured
    )

    data class Urls(
        @SerializedName("full")
        val full: String?, // https://images.unsplash.com/photo-1706451822135-e7276f49b06e?crop=entropy&cs=srgb&fm=jpg&ixid=M3w1NzA4MjR8MHwxfHJhbmRvbXx8fHx8fHx8fDE3MDg4NTkyNzF8&ixlib=rb-4.0.3&q=85
        @SerializedName("raw")
        val raw: String?, // https://images.unsplash.com/photo-1706451822135-e7276f49b06e?ixid=M3w1NzA4MjR8MHwxfHJhbmRvbXx8fHx8fHx8fDE3MDg4NTkyNzF8&ixlib=rb-4.0.3
        @SerializedName("regular")
        val regular: String?, // https://images.unsplash.com/photo-1706451822135-e7276f49b06e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w1NzA4MjR8MHwxfHJhbmRvbXx8fHx8fHx8fDE3MDg4NTkyNzF8&ixlib=rb-4.0.3&q=80&w=1080
        @SerializedName("small")
        val small: String?, // https://images.unsplash.com/photo-1706451822135-e7276f49b06e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w1NzA4MjR8MHwxfHJhbmRvbXx8fHx8fHx8fDE3MDg4NTkyNzF8&ixlib=rb-4.0.3&q=80&w=400
        @SerializedName("small_s3")
        val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1706451822135-e7276f49b06e
        @SerializedName("thumb")
        val thumb: String? // https://images.unsplash.com/photo-1706451822135-e7276f49b06e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w1NzA4MjR8MHwxfHJhbmRvbXx8fHx8fHx8fDE3MDg4NTkyNzF8&ixlib=rb-4.0.3&q=80&w=200
    )

    data class User(
        @SerializedName("accepted_tos")
        val acceptedTos: Boolean?, // true
        @SerializedName("bio")
        val bio: String?, // Designer and photographer. Founder and Creative Director of rdateam.com
        @SerializedName("first_name")
        val firstName: String?, // Uran
        @SerializedName("for_hire")
        val forHire: Boolean?, // false
        @SerializedName("id")
        val id: String?, // k4_7Jz4-104
        @SerializedName("instagram_username")
        val instagramUsername: String?, // uranwang
        @SerializedName("last_name")
        val lastName: String?, // Wang
        @SerializedName("links")
        val links: Links?,
        @SerializedName("location")
        val location: String?, // Shanghai / Auckland
        @SerializedName("name")
        val name: String?, // Uran Wang
        @SerializedName("portfolio_url")
        val portfolioUrl: String?, // http://www.rdateam.com
        @SerializedName("profile_image")
        val profileImage: ProfileImage?,
        @SerializedName("social")
        val social: Social?,
        @SerializedName("total_collections")
        val totalCollections: Int?, // 2
        @SerializedName("total_likes")
        val totalLikes: Int?, // 4
        @SerializedName("total_photos")
        val totalPhotos: Int?, // 217
        @SerializedName("total_promoted_photos")
        val totalPromotedPhotos: Int?, // 36
        @SerializedName("twitter_username")
        val twitterUsername: Any?, // null
        @SerializedName("updated_at")
        val updatedAt: String?, // 2024-02-25T07:56:51Z
        @SerializedName("username")
        val username: String? // uranwang
    ) {
        data class Links(
            @SerializedName("followers")
            val followers: String?, // https://api.unsplash.com/users/uranwang/followers
            @SerializedName("following")
            val following: String?, // https://api.unsplash.com/users/uranwang/following
            @SerializedName("html")
            val html: String?, // https://unsplash.com/@uranwang
            @SerializedName("likes")
            val likes: String?, // https://api.unsplash.com/users/uranwang/likes
            @SerializedName("photos")
            val photos: String?, // https://api.unsplash.com/users/uranwang/photos
            @SerializedName("portfolio")
            val portfolio: String?, // https://api.unsplash.com/users/uranwang/portfolio
            @SerializedName("self")
            val self: String? // https://api.unsplash.com/users/uranwang
        )

        data class ProfileImage(
            @SerializedName("large")
            val large: String?, // https://images.unsplash.com/profile-1706185252231-a150070d3c4b?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
            @SerializedName("medium")
            val medium: String?, // https://images.unsplash.com/profile-1706185252231-a150070d3c4b?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
            @SerializedName("small")
            val small: String? // https://images.unsplash.com/profile-1706185252231-a150070d3c4b?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
        )

        data class Social(
            @SerializedName("instagram_username")
            val instagramUsername: String?, // uranwang
            @SerializedName("paypal_email")
            val paypalEmail: Any?, // null
            @SerializedName("portfolio_url")
            val portfolioUrl: String?, // http://www.rdateam.com
            @SerializedName("twitter_username")
            val twitterUsername: Any? // null
        )
    }
}