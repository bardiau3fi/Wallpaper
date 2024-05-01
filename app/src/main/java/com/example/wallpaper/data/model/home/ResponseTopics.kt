package com.example.wallpaper.data.model.home


import com.google.gson.annotations.SerializedName

class ResponseTopics : ArrayList<ResponseTopics.ResponseTopicsItem>(){
    data class ResponseTopicsItem(
        @SerializedName("cover_photo")
        val coverPhoto: CoverPhoto?,
        @SerializedName("current_user_contributions")
        val currentUserContributions: List<Any?>?,
        @SerializedName("description")
        val description: String?, // Explore the magic of the season with cool tones. Where icy blues, purples, greens and grays paint a serene canvas. Embrace the beauty of cool colors to infuse a sense of tranquility into your images. From frost-kissed landscapes to subtle macro details, let the colour palette of the season be the focus of your compositions. 
        @SerializedName("ends_at")
        val endsAt: String?, // 2024-02-29T23:59:59Z
        @SerializedName("featured")
        val featured: Boolean?, // true
        @SerializedName("id")
        val id: String?, // iXRd8cmpUDI
        @SerializedName("links")
        val links: Links?,
        @SerializedName("only_submissions_after")
        val onlySubmissionsAfter: Any?, // null
        @SerializedName("owners")
        val owners: List<Owner?>?,
        @SerializedName("preview_photos")
        val previewPhotos: List<PreviewPhoto?>?,
        @SerializedName("published_at")
        val publishedAt: String?, // 2024-01-26T16:14:38Z
        @SerializedName("slug")
        val slug: String?, // cool-tones
        @SerializedName("starts_at")
        val startsAt: String?, // 2024-01-26T00:00:00Z
        @SerializedName("status")
        val status: String?, // open
        @SerializedName("title")
        val title: String?, // Cool Tones
        @SerializedName("total_current_user_submissions")
        val totalCurrentUserSubmissions: Any?, // null
        @SerializedName("total_photos")
        val totalPhotos: Int?, // 1776
        @SerializedName("updated_at")
        val updatedAt: String?, // 2024-02-25T08:09:19Z
        @SerializedName("visibility")
        val visibility: String? // featured
    ) {
        data class CoverPhoto(
            @SerializedName("alt_description")
            val altDescription: String?, // the sun shines through the clouds over a city
            @SerializedName("blur_hash")
            val blurHash: String?, // L655hH_3-ixs~q?Z-oxt?Z-nxtt7
            @SerializedName("breadcrumbs")
            val breadcrumbs: List<Any?>?,
            @SerializedName("color")
            val color: String?, // #0c2640
            @SerializedName("created_at")
            val createdAt: String?, // 2024-02-24T17:23:12Z
            @SerializedName("current_user_collections")
            val currentUserCollections: List<Any?>?,
            @SerializedName("description")
            val description: String?, // This vertical shot captures the essence of a moody urban landscape as crepuscular rays break through the dense cloud cover, illuminating parts of the city below. The telecommunication tower stands tall, a modern contrast against the natural drama unfolding in the sky. The image's vertical orientation makes it a perfect fit for mobile wallpaper, inviting a slice of the city's dynamic atmosphere into one's daily routine.
            @SerializedName("height")
            val height: Int?, // 3413
            @SerializedName("id")
            val id: String?, // LsRSF0g3AVA
            @SerializedName("liked_by_user")
            val likedByUser: Boolean?, // false
            @SerializedName("likes")
            val likes: Int?, // 2
            @SerializedName("links")
            val links: Links?,
            @SerializedName("promoted_at")
            val promotedAt: String?, // 2024-01-28T19:03:49Z
            @SerializedName("slug")
            val slug: String?, // the-sun-shines-through-the-clouds-over-a-city-LsRSF0g3AVA
            @SerializedName("sponsorship")
            val sponsorship: Any?, // null
            @SerializedName("topic_submissions")
            val topicSubmissions: TopicSubmissions?,
            @SerializedName("updated_at")
            val updatedAt: String?, // 2024-02-25T11:59:38Z
            @SerializedName("urls")
            val urls: Urls?,
            @SerializedName("user")
            val user: User?,
            @SerializedName("width")
            val width: Int? // 5120
        ) {
            data class Links(
                @SerializedName("download")
                val download: String?, // https://unsplash.com/photos/LsRSF0g3AVA/download
                @SerializedName("download_location")
                val downloadLocation: String?, // https://api.unsplash.com/photos/LsRSF0g3AVA/download
                @SerializedName("html")
                val html: String?, // https://unsplash.com/photos/the-sun-shines-through-the-clouds-over-a-city-LsRSF0g3AVA
                @SerializedName("self")
                val self: String? // https://api.unsplash.com/photos/the-sun-shines-through-the-clouds-over-a-city-LsRSF0g3AVA
            )
    
            data class TopicSubmissions(
                @SerializedName("architecture-interior")
                val architectureInterior: ArchitectureInterior?,
                @SerializedName("archival")
                val archival: Archival?,
                @SerializedName("cool-tones")
                val coolTones: CoolTones?,
                @SerializedName("current-events")
                val currentEvents: CurrentEvents?,
                @SerializedName("3d-renders")
                val dRenders: DRenders?,
                @SerializedName("experimental")
                val experimental: Experimental?,
                @SerializedName("film")
                val film: Film?,
                @SerializedName("food-drink")
                val foodDrink: FoodDrink?,
                @SerializedName("health")
                val health: Health?,
                @SerializedName("nature")
                val nature: Nature?,
                @SerializedName("spirituality")
                val spirituality: Spirituality?,
                @SerializedName("street-photography")
                val streetPhotography: StreetPhotography?,
                @SerializedName("textures-patterns")
                val texturesPatterns: TexturesPatterns?,
                @SerializedName("travel")
                val travel: Travel?,
                @SerializedName("wallpapers")
                val wallpapers: Wallpapers?
            ) {
                data class ArchitectureInterior(
                    @SerializedName("approved_on")
                    val approvedOn: String?, // 2024-02-22T23:16:06Z
                    @SerializedName("status")
                    val status: String? // approved
                )
    
                data class Archival(
                    @SerializedName("approved_on")
                    val approvedOn: String?, // 2024-02-25T08:44:01Z
                    @SerializedName("status")
                    val status: String? // approved
                )
    
                data class CoolTones(
                    @SerializedName("approved_on")
                    val approvedOn: String?, // 2024-02-25T08:09:19Z
                    @SerializedName("status")
                    val status: String? // approved
                )
    
                data class CurrentEvents(
                    @SerializedName("status")
                    val status: String? // unevaluated
                )
    
                data class DRenders(
                    @SerializedName("approved_on")
                    val approvedOn: String?, // 2024-02-23T10:18:46Z
                    @SerializedName("status")
                    val status: String? // approved
                )
    
                data class Experimental(
                    @SerializedName("status")
                    val status: String? // unevaluated
                )
    
                data class Film(
                    @SerializedName("approved_on")
                    val approvedOn: String?, // 2024-02-25T08:29:02Z
                    @SerializedName("status")
                    val status: String? // approved
                )
    
                data class FoodDrink(
                    @SerializedName("status")
                    val status: String? // unevaluated
                )
    
                data class Health(
                    @SerializedName("status")
                    val status: String? // unevaluated
                )
    
                data class Nature(
                    @SerializedName("approved_on")
                    val approvedOn: String?, // 2024-02-23T17:09:20Z
                    @SerializedName("status")
                    val status: String? // approved
                )
    
                data class Spirituality(
                    @SerializedName("status")
                    val status: String? // unevaluated
                )
    
                data class StreetPhotography(
                    @SerializedName("approved_on")
                    val approvedOn: String?, // 2024-02-25T08:34:35Z
                    @SerializedName("status")
                    val status: String? // approved
                )
    
                data class TexturesPatterns(
                    @SerializedName("approved_on")
                    val approvedOn: String?, // 2024-02-25T08:12:23Z
                    @SerializedName("status")
                    val status: String? // rejected
                )
    
                data class Travel(
                    @SerializedName("approved_on")
                    val approvedOn: String?, // 2024-02-23T16:38:56Z
                    @SerializedName("status")
                    val status: String? // approved
                )
    
                data class Wallpapers(
                    @SerializedName("approved_on")
                    val approvedOn: String?, // 2024-02-23T16:37:26Z
                    @SerializedName("status")
                    val status: String? // approved
                )
            }
    
            data class Urls(
                @SerializedName("full")
                val full: String?, // https://images.unsplash.com/photo-1708795034347-76494506e7c3?ixlib=rb-4.0.3&q=85&fm=jpg&crop=entropy&cs=srgb
                @SerializedName("raw")
                val raw: String?, // https://images.unsplash.com/photo-1708795034347-76494506e7c3?ixlib=rb-4.0.3
                @SerializedName("regular")
                val regular: String?, // https://images.unsplash.com/photo-1708795034347-76494506e7c3?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max
                @SerializedName("small")
                val small: String?, // https://images.unsplash.com/photo-1708795034347-76494506e7c3?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max
                @SerializedName("small_s3")
                val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1708795034347-76494506e7c3
                @SerializedName("thumb")
                val thumb: String? // https://images.unsplash.com/photo-1708795034347-76494506e7c3?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max
            )
    
            data class User(
                @SerializedName("accepted_tos")
                val acceptedTos: Boolean?, // true
                @SerializedName("bio")
                val bio: String?, // I like travel and nature photography, with SLR, phone or drone :-)
                @SerializedName("first_name")
                val firstName: String?, // Bernd 📷
                @SerializedName("for_hire")
                val forHire: Boolean?, // false
                @SerializedName("id")
                val id: String?, // HW_tP5YiWF8
                @SerializedName("instagram_username")
                val instagramUsername: String?, // HDBernd
                @SerializedName("last_name")
                val lastName: String?, // Dittrich
                @SerializedName("links")
                val links: Links?,
                @SerializedName("location")
                val location: String?, // Germany
                @SerializedName("name")
                val name: String?, // Bernd 📷 Dittrich
                @SerializedName("portfolio_url")
                val portfolioUrl: String?, // https://www.instagram.com/hdbernd/
                @SerializedName("profile_image")
                val profileImage: ProfileImage?,
                @SerializedName("social")
                val social: Social?,
                @SerializedName("total_collections")
                val totalCollections: Int?, // 4
                @SerializedName("total_likes")
                val totalLikes: Int?, // 2876
                @SerializedName("total_photos")
                val totalPhotos: Int?, // 11352
                @SerializedName("total_promoted_photos")
                val totalPromotedPhotos: Int?, // 94
                @SerializedName("twitter_username")
                val twitterUsername: String?, // HDBernd
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-02-25T13:41:18Z
                @SerializedName("username")
                val username: String? // hdbernd
            ) {
                data class Links(
                    @SerializedName("followers")
                    val followers: String?, // https://api.unsplash.com/users/hdbernd/followers
                    @SerializedName("following")
                    val following: String?, // https://api.unsplash.com/users/hdbernd/following
                    @SerializedName("html")
                    val html: String?, // https://unsplash.com/@hdbernd
                    @SerializedName("likes")
                    val likes: String?, // https://api.unsplash.com/users/hdbernd/likes
                    @SerializedName("photos")
                    val photos: String?, // https://api.unsplash.com/users/hdbernd/photos
                    @SerializedName("portfolio")
                    val portfolio: String?, // https://api.unsplash.com/users/hdbernd/portfolio
                    @SerializedName("self")
                    val self: String? // https://api.unsplash.com/users/hdbernd
                )
    
                data class ProfileImage(
                    @SerializedName("large")
                    val large: String?, // https://images.unsplash.com/profile-1557995124272-d62d831ec026?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                    @SerializedName("medium")
                    val medium: String?, // https://images.unsplash.com/profile-1557995124272-d62d831ec026?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                    @SerializedName("small")
                    val small: String? // https://images.unsplash.com/profile-1557995124272-d62d831ec026?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
                )
    
                data class Social(
                    @SerializedName("instagram_username")
                    val instagramUsername: String?, // HDBernd
                    @SerializedName("paypal_email")
                    val paypalEmail: Any?, // null
                    @SerializedName("portfolio_url")
                    val portfolioUrl: String?, // https://www.instagram.com/hdbernd/
                    @SerializedName("twitter_username")
                    val twitterUsername: String? // HDBernd
                )
            }
        }
    
        data class Links(
            @SerializedName("html")
            val html: String?, // https://unsplash.com/t/cool-tones
            @SerializedName("photos")
            val photos: String?, // https://api.unsplash.com/topics/cool-tones/photos
            @SerializedName("self")
            val self: String? // https://api.unsplash.com/topics/cool-tones
        )
    
        data class Owner(
            @SerializedName("accepted_tos")
            val acceptedTos: Boolean?, // true
            @SerializedName("bio")
            val bio: String?, // Behind the scenes of the team building the internet’s open library of freely useable visuals.
            @SerializedName("first_name")
            val firstName: String?, // Unsplash
            @SerializedName("for_hire")
            val forHire: Boolean?, // false
            @SerializedName("id")
            val id: String?, // QV5S1rtoUJ0
            @SerializedName("instagram_username")
            val instagramUsername: String?, // unsplash
            @SerializedName("last_name")
            val lastName: Any?, // null
            @SerializedName("links")
            val links: Links?,
            @SerializedName("location")
            val location: String?, // Montreal, Canada
            @SerializedName("name")
            val name: String?, // Unsplash
            @SerializedName("portfolio_url")
            val portfolioUrl: String?, // https://www.threads.net/@unsplash
            @SerializedName("profile_image")
            val profileImage: ProfileImage?,
            @SerializedName("social")
            val social: Social?,
            @SerializedName("total_collections")
            val totalCollections: Int?, // 18
            @SerializedName("total_likes")
            val totalLikes: Int?, // 16115
            @SerializedName("total_photos")
            val totalPhotos: Int?, // 29
            @SerializedName("total_promoted_photos")
            val totalPromotedPhotos: Int?, // 7
            @SerializedName("twitter_username")
            val twitterUsername: String?, // unsplash
            @SerializedName("updated_at")
            val updatedAt: String?, // 2024-02-22T10:25:05Z
            @SerializedName("username")
            val username: String? // unsplash
        ) {
            data class Links(
                @SerializedName("followers")
                val followers: String?, // https://api.unsplash.com/users/unsplash/followers
                @SerializedName("following")
                val following: String?, // https://api.unsplash.com/users/unsplash/following
                @SerializedName("html")
                val html: String?, // https://unsplash.com/@unsplash
                @SerializedName("likes")
                val likes: String?, // https://api.unsplash.com/users/unsplash/likes
                @SerializedName("photos")
                val photos: String?, // https://api.unsplash.com/users/unsplash/photos
                @SerializedName("portfolio")
                val portfolio: String?, // https://api.unsplash.com/users/unsplash/portfolio
                @SerializedName("self")
                val self: String? // https://api.unsplash.com/users/unsplash
            )
    
            data class ProfileImage(
                @SerializedName("large")
                val large: String?, // https://images.unsplash.com/profile-1544707963613-16baf868f301?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                @SerializedName("medium")
                val medium: String?, // https://images.unsplash.com/profile-1544707963613-16baf868f301?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                @SerializedName("small")
                val small: String? // https://images.unsplash.com/profile-1544707963613-16baf868f301?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
            )
    
            data class Social(
                @SerializedName("instagram_username")
                val instagramUsername: String?, // unsplash
                @SerializedName("paypal_email")
                val paypalEmail: Any?, // null
                @SerializedName("portfolio_url")
                val portfolioUrl: String?, // https://www.threads.net/@unsplash
                @SerializedName("twitter_username")
                val twitterUsername: String? // unsplash
            )
        }
    
        data class PreviewPhoto(
            @SerializedName("blur_hash")
            val blurHash: String?, // L655hH_3-ixs~q?Z-oxt?Z-nxtt7
            @SerializedName("created_at")
            val createdAt: String?, // 2024-02-24T17:23:12Z
            @SerializedName("id")
            val id: String?, // LsRSF0g3AVA
            @SerializedName("slug")
            val slug: String?, // the-sun-shines-through-the-clouds-over-a-city-LsRSF0g3AVA
            @SerializedName("updated_at")
            val updatedAt: String?, // 2024-02-25T11:59:38Z
            @SerializedName("urls")
            val urls: Urls?
        ) {
            data class Urls(
                @SerializedName("full")
                val full: String?, // https://images.unsplash.com/photo-1708795034347-76494506e7c3?ixlib=rb-4.0.3&q=85&fm=jpg&crop=entropy&cs=srgb
                @SerializedName("raw")
                val raw: String?, // https://images.unsplash.com/photo-1708795034347-76494506e7c3?ixlib=rb-4.0.3
                @SerializedName("regular")
                val regular: String?, // https://images.unsplash.com/photo-1708795034347-76494506e7c3?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max
                @SerializedName("small")
                val small: String?, // https://images.unsplash.com/photo-1708795034347-76494506e7c3?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max
                @SerializedName("small_s3")
                val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1708795034347-76494506e7c3
                @SerializedName("thumb")
                val thumb: String? // https://images.unsplash.com/photo-1708795034347-76494506e7c3?ixlib=rb-4.0.3&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max
            )
        }
    }
}