package guru.springframework.spring5jokesappv2.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;


@Service
public class JokeServiceImpl implements jokeservice {

private ChuckNorrisQuotes quotes;

public JokeServiceImpl() {
this.quotes = new ChuckNorrisQuotes();
}


public String getQuote() {
return quotes.getRandomQuote();
}


@Override
public String getJoke() {
	// TODO Auto-generated method stub
	return quotes.getRandomQuote();
}

}