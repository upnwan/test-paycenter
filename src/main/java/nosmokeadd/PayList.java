package nosmokeadd;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="PayList_table")
public class PayList {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long payId;
        private Long point;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public Long getPayId() {
            return payId;
        }

        public void setPayId(Long payId) {
            this.payId = payId;
        }
        public Long getPoint() {
            return point;
        }

        public void setPoint(Long point) {
            this.point = point;
        }

}
