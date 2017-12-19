package com.phearun.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

	@NotNull(message = "error.title.notnull")
	@Size(min = 1, max = 30, message = "error.title.size")
	private String title;
	
	@NotNull(message="error.description.notnull")
	@Size(max = 100, message = "error.description.size")
	private String description;
	
	private boolean isPublish;

}
