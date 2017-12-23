package es.gialnet.prodacon.regantes.tickets;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketsSQLRepository {
    private final JdbcTemplate jdbc;

    public TicketsSQLRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    /**
     *
     * @param NumPage
     * @param SizePage
     * @param xEstanque
     * @return
     */
    public List<TuplasTickets> getListaTickets(int NumPage, int SizePage, int xEstanque){

        int Offset = SizePage * (NumPage - 1);

        String sql = "SELECT * from Tickets where estanque = ? order by id desc LIMIT ? OFFSET ?";

        return this.jdbc.query(sql, new BeanPropertyRowMapper(TuplasTickets.class), new Object[]{xEstanque, SizePage, Offset});
    }
}
