package com.soprasteria.bestof;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.bestof.classes.Movie;
import com.soprasteria.bestof.classes.Song;

@RestController
@RequestMapping("/bestof")
public class movieSongController {

	@GetMapping("/movie")
	@ResponseBody
	public Movie bestMovie() {
		List<String> cast = new ArrayList<>();
		cast.add("Ryan Gosling");
		cast.add("Ron Perlman");
		cast.add("Oscar Isaac");
		return new Movie("Drive", "Nicolas Winding Refn", 2011, cast);

	}

	@GetMapping("/song")
	public Song bestSong() {
		return new Song("This Must Be The Place", "Rock", "Talking Heads", "Cheyenne and the Fellows", 1983);
	}

}
