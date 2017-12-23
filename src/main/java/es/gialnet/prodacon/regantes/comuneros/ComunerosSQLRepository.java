package es.gialnet.prodacon.regantes.comuneros;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ComunerosSQLRepository {
    private final JdbcTemplate jdbc;

    public ComunerosSQLRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<TuplasComuneros> findCustomerById() {

        String sql = "SELECT * from comuneros order by apellidos";

        return this.jdbc.query(sql, new BeanPropertyRowMapper(TuplasComuneros.class));
    }

    public List<TuplasComuneros> findCustomerById2(String cust_id) {

        String sql = "SELECT * from comuneros where codigo=?";

        return this.jdbc.query(sql, new BeanPropertyRowMapper(TuplasComuneros.class), new Object[]{cust_id});
    }

    public List<TuplasComuneros> findCustomerById3(String cust_id) {

        String sql = "SELECT * from comuneros where codigo=?";

        return this.jdbc.query(sql, (rs, i) -> new TuplasComuneros(rs.getString("codigo"), rs.getString("nombre"),
                rs.getString("apellidos"),rs.getString("movil"), rs.getString("email")), cust_id);
    }


    /**
     * Get comuneros by page
     * @param NumPage
     * @param SizePage
     * @return
     */
    public List<TuplasComuneros> getListaComuneros(int NumPage, int SizePage){

        int Offset = SizePage * (NumPage - 1);

        String sql = "SELECT * from comuneros order by codigo desc LIMIT ? OFFSET ?";

        return this.jdbc.query(sql, new BeanPropertyRowMapper(TuplasComuneros.class), new Object[]{SizePage, Offset});
    }

}
