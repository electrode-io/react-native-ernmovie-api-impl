/*
 * Copyright 2017 WalmartLabs
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import Foundation

/**
 * This class is a generated place holder for your Movies implementations.!
 * Feel free to modify this class contents as needed. `ern regen-api-impl` command WILL NOT modify the content of this class.
 * Don't modify the class name as this naming convention is used for container generation.
 */
@objc public class MoviesApiRequestHandlerProvider : RequestHandlerProvider, MoviesApiRequestHandlerDelegate
{
    /**
     * - Parameter config : Optional config object that can be passed to an api impl provider.
     */
    init(handlerConfig: MoviesApiConfig? = nil)
    {
        super.init(config: handlerConfig)
    }

    public func registerGetTopRatedMoviesRequestHandler()
    {
        let moviesApi = MoviesAPI()
        moviesApi.requests.registerGetTopRatedMoviesRequestHandler { (data, completion) in
            var movies: [Movie] = []
            movies.append(Movie(id: "1", title: "The Shawshank Redemption", releaseYear: 1994, imageUrl: "http://bit.ly/2xZm1Zr", rating: 9.2, synopsis: nil))
            movies.append(Movie(id: "2", title: "The Godfather", releaseYear: 1972, imageUrl: "http://bit.ly/2wK5TuA", rating: 9.2, synopsis: nil))
            movies.append(Movie(id: "3", title: "The Godfather: Part II", releaseYear: 1974, imageUrl: "http://bit.ly/2yysiIA", rating: 9, synopsis: nil))
            movies.append(Movie(id: "4", title: "The Dark Knight", releaseYear: 2008, imageUrl: "http://bit.ly/2iZPBqw", rating: 9, synopsis: nil))
            movies.append(Movie(id: "5", title: "12 Angry Men", releaseYear: 1957, imageUrl: "http://bit.ly/2xwkt7r", rating: 8.9, synopsis: nil))
            completion(movies, nil)
        }
    }
    public func registerGetMovieDetailRequestHandler()
    {
        // TODO: Needs to be implemented.
    }

}

// DO NOT rename this class as this naming convention is used when a container is generated.
public class MoviesApiConfig : RequestHandlerConfig
{
    
}
