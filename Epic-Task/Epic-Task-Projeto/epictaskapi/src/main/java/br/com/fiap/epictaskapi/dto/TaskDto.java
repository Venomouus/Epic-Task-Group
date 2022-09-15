package br.com.fiap.epictaskapi.dto;

public record TaskDto (

     Long id,
     String title,
     String description,
     int score,
     int status

) {

     public TaskDto(String title, String description){
          this(0l, title, description, 100, 0);
     }

}
