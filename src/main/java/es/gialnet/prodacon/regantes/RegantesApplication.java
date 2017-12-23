package es.gialnet.prodacon.regantes;

import es.gialnet.prodacon.regantes.comuneros.ComunerosSQLRepository;
import es.gialnet.prodacon.regantes.tickets.TicketsSQLRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RegantesApplication {

    @Bean
    public CommandLineRunner exampleQuery(ComunerosSQLRepository repository) {
        return arg->repository.getListaComuneros(1,5).forEach(System.err::println);
    }


    @Bean
    public CommandLineRunner PruTicketTicket(TicketsSQLRepository repository) {
        return arg->repository.getListaTickets(1,5,6600).forEach(System.err::println);

    }

	public static void main(String[] args) {

        SpringApplication.run(RegantesApplication.class, args);

	}
}
